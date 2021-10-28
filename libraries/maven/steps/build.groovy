
void call() {
   node {
      stage("Maven: Build") {
      
         sh "${config.some_var}"  
      }   
   }
}
