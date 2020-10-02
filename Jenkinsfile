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
