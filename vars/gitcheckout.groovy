def call(Map inputparams)
{
checkout(
[$class: 'GitSCM', 
branches: [[name: inputparams.branch]],
 doGenerateSubmoduleConfigurations: false,
 extensions: [], 
 submoduleCfg: [], 
 userRemoteConfigs: [[ url: inputparams.url]]])
 }
