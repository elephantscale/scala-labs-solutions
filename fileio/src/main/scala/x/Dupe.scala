package x

import scala.io.Source

object Dupe {
    def main(args: Array[String]): Unit = {
        val filename = "twinkle.txt"
        for (line <- Source.fromFile(filename).getLines) {
            println(line)
        }
    }
}
