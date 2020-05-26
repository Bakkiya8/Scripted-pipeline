def call()
{
     def  mvn= tool (name: 'Maven', type: 'maven') + '/bin/mvn'
     withSonarQubeEnv('Sonar')  {
         sh "${mvn} sonar:sonar"
     }
}
