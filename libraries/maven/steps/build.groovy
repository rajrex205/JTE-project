void call(){
    stage("Maven: Build"){
        steps{
        sh 'mvn clean install'
        }
    }
}
