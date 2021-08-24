class Square(a: Int) extends Shape {

  override def toString: String = {
    return "[Square (a=" + a + ")]"
  }

  override def area(): Double = {
    return a * a
  }

}

