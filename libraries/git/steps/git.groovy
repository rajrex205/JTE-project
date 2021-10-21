void call(){
    stage("git: checkout"){
        steps {
            git branch: "master", credentialsId: 'git2', url: 'https://github.com/rajrex205/maven-project.git'
        }
    }
}
