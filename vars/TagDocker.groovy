def call(Map imgname=[:],Closure body={})
{
 // def dockerImage = docker.build("${imgname.imagename}:${env.BUILD_ID}")
     // dockerImage.push()
 def String cmd = " " " docker build -t ${imgname.imagename}:${BUILD_NUMBER} .docker push dileep95/dileep-spring:$BUILD_NUMBER " " "
 sh cmd
  body()
}
