pipeline {
    agent any
    stages {
        
        stage('Compile') {
            steps {
                echo "Compile"
                bat 'javac factorial.java test_factorial.java'
            }
        }
        stage('Test'){
            steps{
                echo "Test"
                bat 'java test_factorial'
            }
        }
        stage('Run'){
            steps{
                echo "Run"
                bat 'java factorial'
            }
        }
        stage('Package JAR'){
            steps{
                echo "Build"
                bat 'jar cfm factorial.jar manifest.txt factorial.class'
            }
        }
        stage('Archive JAR'){
            steps{
                echo "Deploy"
                archiveArtifacts artifacts: 'factorial.jar'
            }
        }
    }
    post{
        success{
            echo 'Build, test, run and JAR creation successful and artifact is ready!'
        }
        failure{
            echo 'Build or test failed!'
        }
    }
     
}