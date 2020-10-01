pipeline { 
    agent any  
    stages {
         stage('Compile') { 
            steps { 
               sh '''
               cd demo
               mvn compile
               '''
            }
        }
        stage('Test') { 
            steps { 
               sh '''
               cd demo
               mvn test
               '''
            }
        }
        stage("build & SonarQube analysis") {
            agent any
            steps {
              withSonarQubeEnv('sonarkube') {
                  sh '''cd demo
                mvn clean package sonar:sonar'''
              }
            }
          }
        stage('build') { 
            steps { 
               sh '''
               cd demo
               mvn install
               '''
            }
        }
    }
}
