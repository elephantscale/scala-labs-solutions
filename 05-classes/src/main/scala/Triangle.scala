class Triangle (a: Int, b: Int, c:Int ) {

  override def toString: String = {
    return "[Triangle (a=" + a + ", b=" + b + ", c=" + c + ")]"
  }

  def this (size: Int) = {
    this (size, size, size)
  }

}

