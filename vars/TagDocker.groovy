def call(String params1)
{
  echo $params1
sh 'docker build -t ${params1}:$BUILD_NUMBER .'
}
