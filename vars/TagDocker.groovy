def call(Map imgname=[:],Closure body={})
{
 // def dockerImage = docker.build("${imgname.imagename}:${env.BUILD_ID}")
     // dockerImage.push()
 sh "docker build -t ${imgname.imagename} ."
 //:${imgname.buildNumber} ."
  body()
}
