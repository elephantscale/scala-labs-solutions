package shapes

class Triangle2(val a: Int, val b: Int, val c:Int ) {

  override def toString: String = {
    return s"Triangle (a = $a, b = $b, c = $c)"

  }
  def this (size: Int) = {
    this (size, size, size)
  }
}

