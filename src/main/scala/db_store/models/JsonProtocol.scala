package db_store.models

import spray.json._
import spray.json.DefaultJsonProtocol

object JsonProtocol extends DefaultJsonProtocol {
   implicit val userFormat = jsonFormat3(User.apply)
   implicit def userList(ls:List[User]) = jsonFormat1(ls)
}
