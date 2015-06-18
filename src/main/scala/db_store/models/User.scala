package db_store.models

case class User(name:String, role: Int, registerDate: Long) extends Entity
