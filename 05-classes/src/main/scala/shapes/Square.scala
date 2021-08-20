package shapes

class Square (a: Int, b: Int, c:Int, d: Int ) {

  override def toString: String = {
    return "[Square (a = " + a +  ", b = " + b + ", c = " + c + ", d = " + d + ")]"

    // TODO: return a string with information on a,b,c
    // e.g here is a return string : "[Triangle (a=1, b=2, c=3)]"
  }

  def sides : Int = {
    return 0
  }

  // shorter sides function
  //  def sides : Int = 0

}

