package util

import org.scalatest._

class GitScanSpec extends FlatSpec with Matchers {
  "The GitScan object" should "scan a git dir" in {
    GitScan.status shouldEqual "OK"
  }
}
