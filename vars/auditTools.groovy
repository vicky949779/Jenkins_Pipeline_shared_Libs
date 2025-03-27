def call(){
    node{
        sh """
        python3 --version
        """
    }
}
