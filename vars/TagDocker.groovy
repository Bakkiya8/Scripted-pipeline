def call(Map imgname=[:],Closure body={})
{
 def String cmd = " docker build -t ${imgname.imagename}:${BUILD_NUMBER} ." 
 sh cmd
 echo "Docker Image created"
 def stopcontainer = 'docker stop \$(docker ps -q) || docker rm \$(docker ps -a -q) || docker rmi \$(docker images -q -f dangling=true)'
 sh stopcontainer
 echo "Removed existing image"
 sh "docker run -d -p  ${imgname.port1}:${imgname.containerport} --name  ${imgname.contname} ${imgname.imagename}:$BUILD_NUMBER"
 echo "Docker container created"
 body()
}


