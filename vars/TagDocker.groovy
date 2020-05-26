def call()
{
sh 'docker build -t params1.Imagename:$BUILD_NUMBER .'
}
