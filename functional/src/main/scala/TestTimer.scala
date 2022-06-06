import MyTimer._

object TestTimer {

  def sleepy (duration : Int) = {
    Thread.sleep(duration)
    println ("yawn... slept for " + duration)
    duration
  }

  def main(args: Array[String]): Unit = {
    val a = MyTimer.timeit(sleepy(300))
    println ("result 1: " + a)

    println(timeit { 1 + 2 })

    val x = 1 to 10000000
    val answer = MyTimer.timeit { x.map(x => x * x) }
    //println(answer)
  }
}