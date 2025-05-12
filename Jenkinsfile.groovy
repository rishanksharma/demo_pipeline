pipeline {
    agent any

    stages {
        stage('Clone') {
            steps {
                git 'https://github.com/rishanksharma/demo_pipeline.git'
            }
        }
        stage('Build') {
            steps {
              dir('demo'){
                sh 'mvn clean install'
              }
            }
        }
    }
}
