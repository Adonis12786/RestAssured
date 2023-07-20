pipeline {
    agent any
    tools { 
        maven 'M2_HOME' 
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
