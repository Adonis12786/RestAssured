pipeline {
    agent any
    tools { 
        maven "MAVEN_HOME" 
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
