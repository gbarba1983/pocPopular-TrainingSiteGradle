pipeline {

    agent any

    stages {
                        
        stage('AutoTest') {
            steps {
                // Clean before build
                cleanWs()
		        sh 'docker run --name autoGradle --rm -v /home/ubuntu/PocBcoPopular/jenkins/jenkins_home/workspace/job_popular_pocAutotest_develop:/home/gradle/project -w /home/gradle/project gradle/chrome gradle clean test aggregate'
            }
	    }

          stage('report') {
            steps {
		        sh './pipeline/report/report.sh'
            }
	    }

    }
        post {
        // Clean after build
        always {
            cleanWs(cleanWhenNotBuilt: false,
                    deleteDirs: true,
                    disableDeferredWipeout: true,
                    notFailBuild: true,
                    patterns: [[pattern: '.gitignore', type: 'INCLUDE'],
                               [pattern: '.propsfile', type: 'EXCLUDE']])
        }
    }
}