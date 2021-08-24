class Triangle (a: Int, b: Int, c:Int ) extends Shape {

  override def toString: String = {
    return "[Triangle (a=" + a + ", b=" + b + ", c=" + c + ")]"
  }
  override def area() : Double = {
    val p = (a + b + c) / 2.0
    Math.sqrt(p * (p - a) * (p - b) * (p - c))
  }
}

