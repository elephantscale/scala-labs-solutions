package example

case class Portfolio(name: String, investment: Investment) extends Investment

object InvestmentValuation   {

  def main(args: Array[String]) {
    val offerBitCoin = getOffer(Crypto("Bitcoin", 1000.0))
    println("Offering " + offerBitCoin + " for BitCoin")
    val offerRealEstate = getOffer(RealEstate("House", 1000000.0, 2000.0))
    println("Offering " + offerRealEstate + " for House")
    val offerMutualFund = getOffer(MutualFund("SP500", 2000.0, "lowrisk"))
    println("Offering " + offerMutualFund + " for Mutual Fund")

  }

  def getOffer(investment: Investment): Double = investment match {
    case RealEstate(name, value, monthly) =>
      println("Considering a real estate investment into " + name)
      value + 12 * monthly
    case Crypto(name, amount) =>
      println("Be careful with " + amount + " of " + name)
      amount *  0.10
    case MutualFund(name, amount, yieldType) =>
      println("Investing in Mutual Fund at a " + yieldType)
      if (yieldType == "lowrisk") .9 * amount else  .8 * amount
    case _ =>
      println("I will consider any investment")
      1
  }

}

