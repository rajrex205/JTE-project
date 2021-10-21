
void call() {
   node {
      stage("Maven: Build") {
      
         sh 'mvn install'  
      }   
   }
}
