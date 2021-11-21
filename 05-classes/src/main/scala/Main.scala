import shapes.{Square, Triangle}

object Main {
  def main(args: Array[String]): Unit = {
    val t1 = new Triangle(1,2,3)
    println (t1)

    // TODO-1: Create another triangle and print out
    // your code goes here
    val t2 = new Triangle(4,5,6)
    println (t2)

    // Experiment
    val t3 = new Triangle(1)
    println (t3)

    val s1 = new Square(4)
    println(s1)

  }
}
