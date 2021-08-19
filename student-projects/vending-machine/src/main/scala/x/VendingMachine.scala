package x

// return code for buying
sealed trait ReturnCode
case object Success extends ReturnCode
case object NotEnoughMoney extends ReturnCode
case object ProductNotFound extends ReturnCode
case object SoldOut extends ReturnCode
case object Error extends ReturnCode

// here we define a case class
// so all attributes are available as getters
case class Product (val name : String, val price : Int, var stock : Int) {

  override def toString: String = {
    s"[Product  name=$name, price=$price, stock=$stock]"
  }
}

// all vending machine implementation must implement this trait
trait VendingMachine {
  def checkPrice(item: String): Int
  def buyItem(item: String, money: Int): ReturnCode
}
