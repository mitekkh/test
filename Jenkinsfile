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
                        sh 'mvn clean verify sonar:sonar -Dsonar.projectKey=test -Dsonar.projectName='test' -Dsonar.host.url=http://192.168.75.189:9000 -Dsonar.token=sqp_0b5d9f5e9a9a0d04f1a67a1e0385faabf237a14c'
                    } catch (Exception e) {
                        currentBuild.result = 'FAILURE'
                        echo "Error occurred: ${e.message}"
                    }
                }
            }
        }
   	}
}