pipeline {
    agent any
    stages {
        stage('检查环境') {
            steps {
                sh '''java -version
                mvn -v
                git version
                docker -v'''
            }
        }
    }
}
