package api

import akka.actor.Actor
import db_store.models.{User, LocalDataProvider}
import spray.routing._
import spray.http._
import MediaTypes._
import spray.json._
import spray.json.DefaultJsonProtocol._
import db_store.models.JsonProtocol._

class NotifyServerRouteActor extends Actor with RouteProvider {

  def actorRefFactory = context

  override def receive: Receive = runRoute(applyRoute)
}

trait RouteProvider extends HttpService {
  import spray.httpx.SprayJsonSupport._

  val applyRoute =
    path("") {
      get {
        respondWithMediaType(`application/json`) {
          complete {
            val provider = new LocalDataProvider()
            val list = provider.getAll
            //provider.getAll.foreach({
            //  list + _.toJson.toString
            //)

            list.head
          }
        }
      }
    }
}
