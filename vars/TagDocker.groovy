def call(Map imgname=[:],Closure body={})
{
 def String cmd = " docker build -t ${imgname.imagename}:${BUILD_NUMBER} ." 
 sh cmd
 echo "Docker Image created"
 sh "docker rmi -f ${imgname.contname} "
 echo "Removed existing image"
 sh "docker run -d -p  ${imgname.port1}:${imgname.containerport} --name  ${imgname.contname} ${imgname.imagename}:$BUILD_NUMBER"
 echo "Docker container created"
 body()
}


