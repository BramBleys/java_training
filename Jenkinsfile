pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'mvn clean install'
                sh 'mvn clean verify sonar:sonar'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}