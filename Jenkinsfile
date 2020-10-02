pipeline { 
    agent any  
    stages {
         stage('Compile') { 
            steps { 
               bat '''
               cd demo
               mvn compile
               '''
            }
         }
       
        stage('build') { 
            steps { 
               bat '''
               cd demo
               mvn install
               '''
            }
        }
    }
}
