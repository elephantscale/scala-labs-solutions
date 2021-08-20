package shapes

class Triangle (a: Int, b: Int, c:Int ) {

  override def toString: String = {
    return "[Triangle (a = " + a +  ", b = " + b + ", c = " + c + ")]"

    // TODO: return a string with information on a,b,c
    // e.g here is a return string : "[Triangle (a=1, b=2, c=3)]"
  }

  def this (size: Int) = {
    this (size, size, size)
  }
  // shorter sides function
  //  def sides : Int = 0

}

