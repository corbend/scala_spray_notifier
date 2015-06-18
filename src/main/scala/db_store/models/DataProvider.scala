package db_store.models


abstract class DataProvider[T <: Entity] {

  def getAll: List[T]
}
