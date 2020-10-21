package x

object QuickTest {
  def main(args: Array[String]) {
    val vending = new MyVendingMachine
    println(vending)

    println ("coke price : " + vending.checkPrice("coke"))
    println ("snickers price : "+ vending.checkPrice("snickers"))
    println ("X price : "+ vending.checkPrice("X"))

    println ("buy coke with $1 : " + vending.buyItem("coke", money=1))
    println ("buy coke with $2 : " + vending.buyItem("coke", money=2))
    println(vending)

    println ("buy X with $1 : " + vending.buyItem("X", money=1))

  }
}
