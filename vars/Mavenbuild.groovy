def call(){
 def mvn = tool name: 'Maven', type: 'maven'
 sh "${mvn} clean install"
}
