package util

object GitScan extends AdminTask with App {
  println(status)
}

trait AdminTask {
  lazy val status: String = "OK"
}
