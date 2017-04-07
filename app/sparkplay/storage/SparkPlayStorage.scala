package sparkplay.storage

import play.api.libs.json._

trait SparkPlayStorage {
    def get(k: String): String
    def save(name:String, model:String)
    def list():List[String]
    def remove(k:String)
}

object SparkPlayStorage {
    private val _storage: SparkPlayStorage = new SparkPlayCasbah("mongodb://localhost:27017")
    def getStorage(): SparkPlayStorage = {
        new SparkPlayCasbah("mongodb://localhost:27017")
    }
    def get(k: String): String = _storage.get(k)
    def save(name:String, model:String) = _storage.save(name, model)
    def list() = _storage.list()
    def remove(k:String) = _storage.remove(k)
}