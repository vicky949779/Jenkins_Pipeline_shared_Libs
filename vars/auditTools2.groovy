def call('Map config'){
    node{
        echo "${config.message}"
        sh """
        python3 --version
        """
    }
}