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
               mvn compile
               '''
            }
        }
        stage('Test') { 
            steps { 
               sh '''
               mvn test
               '''
            }
        }
        stage('build') { 
            steps { 
               sh '''
               mvn install
               '''
            }
        }
    }
}
