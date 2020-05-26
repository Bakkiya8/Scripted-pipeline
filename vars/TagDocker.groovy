def builddocker(Map imgname[:],closure body={})
{
  def dockerImage = docker.build("${imgname.imagename}:${env.BUILD_ID}")
      dockerImage.push()
  body()
}
