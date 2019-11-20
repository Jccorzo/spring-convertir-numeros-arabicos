pipeline {
    agent any
    stages {
        stage('Compilation') {
            steps {
                sh './gradlew clean compileJava'
            }
        }
        stage('Unit Test') {
            steps {
                sh './gradlew test '
            }
        }
    }
}
