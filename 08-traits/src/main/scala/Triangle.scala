class Triangle(a: Int, b: Int, c:Int ) extends Shape {

  override def toString: String = {
    return "[Triangle (a=" + a + ", b=" + b + ", c=" + c + ")]"
  }

  // this is from Shape
  override def sides(): Int = 3
}

