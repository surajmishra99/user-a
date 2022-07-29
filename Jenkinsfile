pipeline {

    agent any
        tools{
            maven 'maven_3.8.6'
        }
    stages {
        stage('Checkout from github'){
                    steps{
                        checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/surajmishra99/user-a.git']]])
                    }
        }
        stage('Build mvn project'){
                    steps{
                        sh 'mvn clean package shade:shade'
                    }
                }
        stage("deploy"){
            steps{
                echo 'deploying the application'
            }
        }
    }

}

