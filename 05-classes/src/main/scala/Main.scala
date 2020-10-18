object Main {
  def main(args: Array[String]): Unit = {
    val t1 = new Triangle(1,2,3)
    println (t1)

    val t2 = new Triangle(10)
    println (t2)

    val s1 = new Square(100)
    println (s1)
    println ("square size : " + s1.getSize)
  }
}
