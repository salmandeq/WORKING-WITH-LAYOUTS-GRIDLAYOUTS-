pipeline {
    agent any

    tools {
        maven 'Maven_3.9' 
        jdk 'Java_17'
    }

    stages {
        stage('Build & Test') {
            steps {
                // The -f flag tells Maven where the pom.xml is
                sh 'mvn -f Task3/pom.xml clean test'
            }
        }
    }

    post {
        always {
            junit '**/target/surefire-reports/*.xml'
        }
    }
}
