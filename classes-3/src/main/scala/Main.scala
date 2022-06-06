import shapes._

object Main {
  def main(args: Array[String]): Unit = {
    val t1 = new Triangle1(1, 2, 3)
    println(t1)
    // try to get to t1.a, and you will get an error
//    t1.a
    println("But I cannot get the values with an accessor")
    val t2 = new Triangle2(1, 2, 3)

    println("I can get the values of Triangle2 with an accessor: " + t2.a + ", " + t2.b + ", and " + t2.c)
    // try to set t2.a
    // t2.a = 4
    println("But I cannot set the values with a mutator")

    println("For Triangle3, I can set values with a mutator")
    val t3 = new Triangle3(1, 2, 3)
    t3.a = 5
    t3.b = 6
    t3.c = 7
    println(t3)
  }

}
