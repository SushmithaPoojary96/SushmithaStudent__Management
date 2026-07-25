pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                echo 'Checking out source code...'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t studentmanagement:v1 .'
            }
        }

        stage('Deploy Container') {
            steps {
                sh '''
                docker stop student-app || true
                docker rm student-app || true
                docker run -d --name student-app -p 8081:8080 studentmanagement:v1
                '''
            }
        }
    }
}