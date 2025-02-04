pipeline {
    agent any
    stages {
        stage('Hello') {
            steps {
                echo 'Hello, Jenkins!'
            }
        }
    }
    post {
            always {
                cucumber buildStatus: 'FAILURE', reportTitle: 'JenkinsTest', fileIncludePattern: 'target/cucumber-parallel/**/*.json', sortingMethod: 'ALPHABETICAL', trendsLimit: 5
            }
        }
}
