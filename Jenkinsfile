pipeline {
    agent docker {
            image 'gradle:jdk11' 
        }
    stages {
        stage('Unit Test') {
            steps {
                sh 'gradle clean '
            }
        }
    }
}
