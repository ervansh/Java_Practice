pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        echo 'building'
        bat(script: 'mvn package', encoding: 'UTF-8')
      }
    }

    stage('') {
      steps {
        echo 'Testing'
      }
    }

  }
}