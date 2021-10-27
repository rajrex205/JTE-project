void call() {
   node {
      stage("Maven-1: compile") {
      
         sh 'mvn install'  
      }   
   }
}
