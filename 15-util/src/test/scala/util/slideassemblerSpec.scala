package util

import org.scalatest._

class slideassemblerSpec extends FlatSpec with Matchers {
  "slideassemble" should "just be there for your" in {
    true shouldEqual true
  }
  "slideassemble" should "assemble the files" in {
    slideassembler.main(Array("testdata/list1.txt"))
    slideassembler.count shouldEqual slideassembler.actualCount
  }
}
