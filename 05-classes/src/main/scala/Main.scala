import shapes.{Square, Triangle}

object Main {
  def main(args: Array[String]): Unit = {
    val t1 = new Triangle(1,2,3)
    println (t1)
    t1.a = 5
    println(t1.a)

    // TODO-1: Create another triangle and print out
    // your code goes here
    val t2 = new Triangle(4,5,6)
    println (t2)

    // Experiment
//    val t3 = new Triangle(1)
//    println (t3)

    // TODO-2: Create a square and print
    // your code goes here

    // TODO-3: create a square and get the size
    // your code goes here

    val s1 = new Square(4, 6, 8, 1)
    println(s1)

  }
}
