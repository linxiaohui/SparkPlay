package controllers

import play.api.mvc.Action
import play.api.mvc.Controller
import sparkplay.common.Logging

import models.SparkPlayModel

class SparkPlayController extends Controller with Logging {

  def index = Action {
    Redirect("/sparkplay/index.html")
  }

  def openGraphEditor = Action { request =>
    Ok("")
  }

  def saveGraphEditor = Action { request =>
    val input = request.body.asFormUrlEncoded.get
    val modelname = input("filename")(0)
    val model = input("xml")(0)
    println(modelname)
    println(model)
    SparkPlayModel.saveWorkFlow(modelname, model)
    Ok("")
  }
  
  def list = Action { req =>
    val l = SparkPlayModel.listWorkFlows()
    Ok("")
  }
}