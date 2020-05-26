def call()
{
  def dockerImage = docker.build("bhakya/myhello:${env.BUILD_ID}")
      dockerImage.push()
}
