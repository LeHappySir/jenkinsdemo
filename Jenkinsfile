pipeline {
    agent any
    stages {
        stage('检查环境') {
            steps {
                sh '''java -version
                git version
                docker -v'''
            }
        }
    }
}
