void call(){
    stage("Maven: Build"){
        mvn clean install
    }
}
