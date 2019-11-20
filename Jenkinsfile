pipeline {
    agent docker {
            image 'gradle:jdk11' 
        }
    stages {
        stage('clean') {
            steps {
                sh 'gradle clean '
            }
        }
    }
}
