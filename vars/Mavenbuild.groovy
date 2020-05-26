def call(){
 def mvn = tool (name: 'Maven', type: 'maven') + '/bin/mvn'
 sh "${mvn} clean install"
}
