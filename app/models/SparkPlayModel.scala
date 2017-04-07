package models

import sparkplay.storage.SparkPlayStorage

class SparkPlayModel {
  
}

object SparkPlayModel {
    def saveWorkFlow(name:String, xml:String) {
        SparkPlayStorage.save(name,xml)
    }
    
    def listWorkFlows():List[String] = {
        SparkPlayStorage.list()
    }
}