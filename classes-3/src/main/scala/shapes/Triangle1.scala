package shapes

class Triangle1(a: Int, b: Int, c:Int ) {

  override def toString: String = {
    return s"Triangle (a = $a, b = $b, c = $c)"

  }
  def this (size: Int) = {
    this (size, size, size)
  }
}

