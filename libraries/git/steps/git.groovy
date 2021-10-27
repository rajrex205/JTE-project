void call() {
   node {
      stage("Maven: Build") {
      
         sh "git branch: "master", credentialsId: 'git2', url: 'https://github.com/rajrex205/maven-project.git'"  
      }   
   }
}
