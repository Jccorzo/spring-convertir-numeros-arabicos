pipeline {
    agent {
        docker {
                image 'gradle:jdk11' 
            }
    }
    stages {
        stage('clean') {
            steps {
                sh 'gradle clean '
            }
        }
        stage('Junit test') {
            steps {
                sh 'gradle test '
            }
        }
    }
}
