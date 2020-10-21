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
    val product = inventory get item
    product match {
      case Some(product) => product.price
      case None => -1
    }
  }

  override def buyItem(item: String, money: Int): ReturnCode = {
    val product = inventory get item
    product match {
      case Some(product) =>
        println (s"MVM : buyItem : $product , with money=$money")

        if (product.stock > 0) {
          if (money >= product.price) {
            product.stock -= 1  // decrase stock by one
            Success
          } else
            NotEnoughMoney
        }
        else
          SoldOut

      case None =>
        ProductNotFound
    }
  }
}

