package x

object Collections {
  def main(args: Array[String]) {
    val x = 1 to 10
    val  x2 = x.map(a => a*2)   
    println(x)
    println(x2)
    // question : can you come with a shorthand version
    val x3 = x.map(_*2)
    println(x3)
    // calculate the squares of X
    // TODO: Complete this
    val  xsq = x.map(x => x * x)
    println(xsq)
    // can you do a short-hand version for squares
    // Hint : Math.pow()
    val xsq1 = x.map(Math.pow(_, 2))
    println(xsq1)
    val even = x.filter ( a =>   a%2 == 0)  
    // try a shorter version
    val even1 = x.filter(_ % 2 == 0)
    println(even1)
    // add up all even numbers
    val result = even.reduce( (a,b) => a+b)
    println(result)
    // try the shorter version
    val result1 = even.reduce(_+_)
    println(result1)
    // do this in one line:  add up all even numbers in X
    println(x.filter(a =>   a%2 == 0).reduce((a,b) => a+b))
    // also try the short hand version
    println(x.filter(_%2 == 0).reduce(_+_))
  }
}
