pipeline {
    agent any

    options {
        skipDefaultCheckout(true)
    }

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                bat 'mvnw.cmd clean compile'
            }
        }

        stage('Test') {
            steps {
                bat 'mvnw.cmd test'
            }
        }

        stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv('SonarQube') {
                    bat 'mvnw.cmd sonar:sonar'
                }
            }
        }

        stage('Jar') {
            steps {
                bat 'mvnw.cmd package -DskipTests'
            }
        }

        stage('Docker Image') {
            steps {
                bat 'docker build -t securitydemo1:latest .'
            }
        }
    }
}