pipeline{
    agent any
    stages {
        stage("show") {
            steps {
                //sh "ls -l gradlew"
                sh "chmod +x gradlew"
            }
        }
        stage("Compile") {
            steps {
                sh "./gradlew compileJava"
            }
        }
        stage("Unit test") {
            steps {
                sh "./gradlew test"
            }
        }
    }
}