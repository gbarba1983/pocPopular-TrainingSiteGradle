pipeline {

    agent any

    stages {
                        
        stage('AutoTest') {
            steps {
		        sh 'docker run --name autoGradle --rm -v $PWD:/home/gradle/project -w /home/gradle/project gradle/chrome gradle clean test aggregate'
            }
	    }

    }
}