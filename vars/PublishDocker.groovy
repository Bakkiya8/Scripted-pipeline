def call(Map params1)
{
sh 'docker build -t ${params1}:$BUILD_NUMBER .'
}
