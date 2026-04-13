pipeline {
    agent any

    tools {
        // IMPORTANT: These names must match what you set in 
        // Jenkins -> Manage Jenkins -> Tools
        maven 'Maven_3.9' 
        jdk 'Java_17'
    }

    stages {
        stage('Checkout') {
            steps {
                // This pulls the code from the GitHub repo you showed me
                checkout scm
            }
        }

        stage('Build') {
            steps {
                echo 'Compiling your Java code...'
                sh 'mvn clean compile'
            }
        }

        stage('Run Unit Tests') {
            steps {
                echo 'Running JUnit tests (like GridLayoutExampletest)...'
                // This runs your tests and will fail the build if tests fail
                sh 'mvn test'
            }
        }
    }

    post {
        always {
            // This captures the results of your GridLayoutExampletest
            junit '**/target/surefire-reports/*.xml'
        }
        failure {
            echo 'The build or tests failed. Check the console output!'
        }
    }
}
