package example

sealed abstract class Investment
case class RealEstate(name: String, value: Double, monthly: Double) extends Investment
case class Crypto(name: String, amount: Double) extends Investment
case class MutualFund(name: String, amount: Double, yieldType: String) extends Investment
case class Portfolio(name: String, investment: Investment) extends Investment