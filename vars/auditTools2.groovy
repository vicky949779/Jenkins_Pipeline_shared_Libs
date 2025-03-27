def call(Map config){
    node{
        echo "${config.messag}"
        sh """
        python3 --version
        """
    }
}