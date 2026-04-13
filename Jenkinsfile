pipeline {
    agent any

    tools {
        maven 'Maven2' 
        jdk 'java21'
    }

    stages {
        stage('Build & Test') {
            steps {
                // Use 'bat' instead of 'sh' for Windows
                bat 'mvn clean test'
            }
        }
    }

    post {
        always {
            // This will now find the results once the 'bat' command runs successfully
            junit '**/target/surefire-reports/*.xml'
        }
    }
}
