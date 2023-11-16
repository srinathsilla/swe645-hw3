pipeline {
   environment {
        registry = "srinathsilla/studentsurveyapp"
        registryCredential = 'dockerhub'
    }
   agent any

   stages {
      stage('Build') {
         steps {
            echo 'Building...'
            script{
               sh 'mvn clean package'
               docker.withRegistry('',registryCredential){
                  def customImage = docker.build("srinathsilla/studentsurveyapp:${env.BUILD_NUMBER}")
               }
            }
         }
      }

      stage('Push Image to Dockerhub') {
         steps {
            echo 'pushing to image to docker hub'
            script{
               docker.withRegistry('',registryCredential){
                  sh "docker push srinathsilla/studentsurveyapp:${env.BUILD_NUMBER}"
               }
            }
         }
      }

      stage('Deploying to Rancher to single node(deployed in 3 replicas)') {
         steps {
            echo 'deploying on kubernetes cluster'
            script{
               //sh "docker pull srinathsilla/studentsurveyapp:${env.BUILD_NUMBER}"
               sh "kubectl --kubeconfig /home/ubuntu/.kube/config set image deployment/hw3-cluster container-0=srinathsilla/studentsurveyapp:${BUILD_NUMBER}"
            }
         }
      }
   }
}