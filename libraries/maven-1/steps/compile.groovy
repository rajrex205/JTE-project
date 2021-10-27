void call() {
   node {
      stage("Maven:build") {
      
         sh 'mvn install'  
      }   
   }
}
