
void call() {
   node {
      stage("Maven: Build") {
      
         sh 'mvn clean install'  
      }   
   }
}
