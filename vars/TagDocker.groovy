def call(Map imgname=[:],Closure body={})
{
 // def dockerImage = docker.build("${imgname.imagename}:${env.BUILD_ID}")
     // dockerImage.push()
 def String cmd = " docker build -t ${imgname.imagename}:${BUILD_NUMBER} ." 
 sh cmd
 echo "Docker Image created"
 sh "docker run -d -p 8050:8050 --name springbootApp ${imgname.imagename}:$BUILD_NUMBER"
 echo "Docker container created"
 body()
}


