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
                cucumber buildStatus: 'FAILURE', reportTitle: 'Returns Automation Report', fileIncludePattern: 'target/cucumber-parallel/**/*.json', sortingMethod: 'ALPHABETICAL', trendsLimit: 30
            }
        }
}
