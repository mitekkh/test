pipeline {
    agent any
    
    tools {
        jdk "jdk17"
        maven "maven-3.9.9"
    }
    
    environment {
        JAVA_HOME = "tool jdk17"
        MAVEN_HOME = "tool maven-3.9.9"
    }
    
    stages {
        
        stage('github-clone') {
            steps {
                git branch: 'main', credentialsId: 'github-token', url: 'https://github.com/mitekkh/test.git'
            }
        }
        
        stage('Build') {
            steps {
                script {
                    try {
                        sh 'mvn clean package'
                    } catch (Exception e) {
                        currentBuild.result = 'FAILURE'
                        echo "Error occurred: ${e.message}"
                    }
                }
            }
        }
   	}
}