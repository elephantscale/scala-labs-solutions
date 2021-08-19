package x

object Collections {
  def main(args: Array[String]) {
    val x = 1 to 10
    val  x2 = x.map(a => a*2)   
    // question : did map operation change the value of X?
    // question : can you come with a shorthand version
    println(x2)
    
    // calculate the squares of X
    // TODO: Complete this
    //val  xsq = x.map( ???)
    //println(xsq)
    // can you do a short-hand version for squares
    // Hint : Math.pow()
    
    val even = x.filter ( a =>   a%2 == 0)  
    // try a shorter version
        
    // add up all even numbers
    even.reduce( (a,b) => a+b)  
    // try the shorter version
    
    // do this in one line:  add up all even numbers in X
    //x.filter().reduce()
    // also try the short hand version
  }
}
