pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        echo 'building'
        bat(script: 'mvn package', encoding: 'UTF-8')
      }
    }

    stage('Test UI') {
      parallel {
        stage('Test UI') {
          steps {
            echo 'Testing'
            bat(script: 'mvn test', encoding: 'utf-8')
          }
        }

        stage('Test API') {
          steps {
            echo 'API testing'
          }
        }

      }
    }

  }
}