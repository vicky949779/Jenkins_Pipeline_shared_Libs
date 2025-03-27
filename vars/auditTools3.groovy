def call(Map config){
    node{
        echo "${config.justTest}"
        sh """
        python3 --version
        """
    }
}