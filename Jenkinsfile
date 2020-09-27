pipeline { 
    agent any  
    stages { 
        stage('Build') { 
            steps { 
               sh '''
               docker build .
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
    }
}
