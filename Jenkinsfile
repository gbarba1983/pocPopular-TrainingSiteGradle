pipeline {

    agent any

    stages {
                        
        stage('AutoTest') {
            steps {
		        sh 'docker run --name autoGradle --rm -v /home/ubuntu/PocBcoPopular/jenkins/jenkins_home/workspace/job_popular_pocAutotest_develop:/home/gradle/project -w /home/gradle/project gradle/chrome gradle clean test aggregate'
            }
	    }

    }
}