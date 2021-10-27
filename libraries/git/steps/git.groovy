void call() {
   node {
      stage("github: checkout") {
      
         sh "git branch: "master", credentialsId: 'git2', url: 'https://github.com/rajrex205/maven-project.git'"  
      }   
   }
}
