package shapes

class Triangle3(var a: Int, var b: Int, var c:Int ) {

  override def toString: String = {
    return s"Triangle (a = $a, b = $b, c = $c)"

  }
  def this (size: Int) = {
    this (size, size, size)
  }
}

