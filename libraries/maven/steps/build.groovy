
void call() {
   node {
      stage("Maven: Build") {
       // some code to run unit test
         sh 'mvn clean install'  
      }   
   }
}
