pipeline {
  agent any
  
  stages {
    stage('Clone repository') {
      steps {
        git 'https://github.com/MyroslavKl/DevOps1.git'  
      }
    }
    
    stage('Build Docker image') {
      steps {
        script {
          def dockerImage = docker.build('image') 
          dockerImage.push()
        }
      }
    }
  }
}