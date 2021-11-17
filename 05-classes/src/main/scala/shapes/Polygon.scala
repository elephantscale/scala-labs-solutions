package shapes

class Polygon(a: Int, b: Int, c:Int, d: Int ) {

  override def toString: String = {
    return s"Polygon (a = $a, b = $b, c = $c, d = $d)"


    // TODO: return a string with information on a,b,c,d
    // e.g here is a return string : "[Triangle (a=1, b=2, c=3, d=4)]"
  }

  def sides : Int = {
    return 0
  }

  // shorter sides function
  //  def sides : Int = 0

}

