pipeline { 
    agent any  
    stages { 
        stage('validate') { 
            steps { 
               sh '''   
               cd demo
               mvn validate
               '''
            }
        }
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
        stage('Install') { 
            steps { 
               sh '''
               cd demo
               mvn install
               '''
            }
        }
    }
}
