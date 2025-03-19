pipeline {
    agent any
    
    tools {
        jdk "jdk17"
        maven "maven-3.9.9
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
        
        stage('jdk 17 / maven-3.9.9') {
            steps {
                echo "JDK17 / maven-3.9.9============================="
                sh 'java -version'
                sh 'mvn -version'
            }
        }
   	}
}