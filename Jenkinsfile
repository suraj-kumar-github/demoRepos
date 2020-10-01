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
        stage("build & SonarQube analysis") {
            steps {
              withSonarQubeEnv('project-1') {
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
