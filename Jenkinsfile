pipeline { 
    agent any  
    stages { 
        stage('Build') { 
            steps { 
               sh '''cd demo
               mvn clean install
               '''
            }
        }
    }
}
