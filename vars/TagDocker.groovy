def call(Map imgname)
{
  def dockerImage = docker.build("${imgname}:${env.BUILD_ID}")
      dockerImage.push()
}
