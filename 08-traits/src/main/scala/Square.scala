class Square(a: Int) extends Shape {

  override def toString: String = {
    "[Square (a=" + a + ")]"
  }

  override def area(): Double = {
    a * a
  }

}

