import java.awt.Shape

object Main {
  def main(args: Array[String]): Unit = {
    val t1 = new Triangle(1,2,3)
    println (t1)
    println ("t1.sides: " + t1.sides())

    val s1 = new Square(10)
    println (s1)
    println ("s1.size :" + s1.sides())
  }
}
