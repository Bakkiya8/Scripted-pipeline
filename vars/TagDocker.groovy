def call(string imgname)
{
  def dockerImage = docker.build("${imgname}:${env.BUILD_ID}")
      dockerImage.push()
}
