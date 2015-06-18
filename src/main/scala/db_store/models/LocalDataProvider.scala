package db_store.models


class LocalDataProvider extends DataProvider[User]{

  def getAll :List[User] = {

    List(User("alex", 0, 1434637816223L), User("paul", 1, 1434637816223L))
  }
}
