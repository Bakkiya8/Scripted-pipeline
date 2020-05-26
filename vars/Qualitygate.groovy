 def call()
 {
    timeout(time: 1, unit: 'HOURS')
       {
         def qualitygate = waitForQualityGate()
          if (qualitygate.status != "OK") {
                 error "Pipeline aborted due to quality gate coverage failure: ${qualitygate.status}"
            } 
         }
         }
