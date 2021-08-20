object MyTimer {
  def timeit[R](block: => R): R = {
    // look up 'java System class nano time'
    // http://docs.oracle.com/javase/8/docs/api/java/lang/System.html

    // TODO-1  : mark the time
    val t1 = System.currentTimeMillis()
    val result = block    // call-by-name, save the result
    // TODO-2  : mark the time again
    val t2 = System.currentTimeMillis()
    println("### timeit() : Elapsed time:  %,d  ms".format( (t2 - t1) /1000000 ) )

    result // return the result
  }
}
