pipeline {
    agent any
    tools { 
        maven 'Maven 3.3.9'
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
