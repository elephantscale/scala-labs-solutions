package shapes

class Triangle (var a: Int, b: Int, c:Int ) {

  override def toString: String = {
    return s"Triangle (a = $a, b = $b, c = $c)"

  }
  def this (size: Int) = {
    this (size, size, size)
  }
}

