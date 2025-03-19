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
              
        stage('SonarQube analysis') {
            steps{
                withSonarQubeEnv('SonarQube-Server'){
                    sh "mvn clean package"
                    sh "mvn sonar:sonar -Dsonar.projectKey=test2 -Dsonar.projectName='test2' -Dsonar.host.url=http://192.168.75.189:9000 -Dsonar.token=sqp_6818f8bafea3a45e4e03b1d0777a495669653632"
                }
            }
        }
   	}
}