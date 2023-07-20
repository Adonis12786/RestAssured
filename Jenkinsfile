pipeline {
    agent any
        environment{
            notifyEmail = "adnankhan.bsur@gmail.com"
        }
    tools { 
        maven 'maven_home'
    }
    stages {
        stage ('Initialize') {
            steps {
              bat "mvn clean test"
                }
        }

        stage ('Build') {
            steps {
                echo 'This is a minimal pipeline.'
            }
        }
    }
}
