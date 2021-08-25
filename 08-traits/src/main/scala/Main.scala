object Main {
  def main(args: Array[String]): Unit = {
    val t1 = new Triangle(3, 4, 5)
    println ("t1: " + t1)
    println ("t1.area : " + t1.area())

    // TODO: Create a square and get sides()

    val s1 = new Square(10)
    println (s1)
    println ("s1.area :" + s1.area())

  }
}
