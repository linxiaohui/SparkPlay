package sparkplay.storage

import com.mongodb.casbah.Imports._
import play.api.libs.json._

class SparkPlayCasbah(addr: String) extends SparkPlayStorage {
    val uri = MongoClientURI(addr)
    val timeout = MongoClientOptions(connectTimeout = 1000)
    val mc = MongoClient(uri)
    val db = mc("sparkplay2")
    val workflow = db("workflow")
    
    override def get(name: String): String = {
        val query = MongoDBObject("name" -> name)
        val default = MongoDBObject("workflow" -> "")
        val wk = workflow.findOne(query).getOrElse(default)
        wk.get("workflow").toString()
    }

    override def save(name:String, model:String) {
        val doc = MongoDBObject("name" -> name, "workflow" -> model)
        val key = MongoDBObject("name" -> name)
        workflow.update(key, doc, upsert = true)
    }

    override def list(): List[String] = {
        val wks = workflow.find().toList
        wks.map(wk => {
            wk.get("name").toString()
        })
    }
    override def remove(k: String) {
        val query = MongoDBObject("name" -> k)
        val r = workflow.remove(query)
    }
}