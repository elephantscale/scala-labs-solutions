package x

import scala.collection.mutable
import scala.collection.mutable.{Map, HashMap}


class MyVendingMachine extends VendingMachine {

  // stock
  val inventory : mutable.HashMap[String, Product] = new mutable.HashMap()
  // initialize the inventory
  inventory.put ("coke", new Product("coke", 2, 10));
  inventory.put ("snickers", new Product("snickers", 3, 10));
  inventory.put ("chips", new Product("chips", 4, 10));

  override def toString: String = {
    "[MyVendingMachine.  Inventory:" + inventory + "]"
  }

  override def checkPrice(item: String): Int = {
    0  // default price

    /*
    val product = inventory get item
    product match {
      case Some(product) => // TODO : return product.prince
      case None => // TODO : return -1
    }
     */
  }

  override def buyItem(item: String, money: Int): ReturnCode = {
    val product = inventory get item
    product match {
      case Some(product) =>
        println (s"MVM : buyItem : $product , with money=$money")
        // for now return success
        Success

        // TODO : add some checks
        // for example, check if the money is enough to buy
        // And check if the Product is in stock
        // and don't forget to decrease the stock when purchased

      case None =>
        ProductNotFound
    }
  }
}

