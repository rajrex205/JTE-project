void call(){
    stage("Maven: Build"){
        steps{
        mvn clean install
        }
    }
}
