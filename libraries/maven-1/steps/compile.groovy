void call() {
   node {
      stage("Maven: compile") {
      
         sh 'mvn compile'  
      }   
   }
}
