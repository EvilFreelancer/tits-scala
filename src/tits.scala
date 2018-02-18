import scala.io.Source
import scala.sys.process._

object tits {

  def main(args: Array[String]): Unit = {
    var j = 1
    var filename = ""

    while(true){
      clear()
      for (i <- 1 to 3) {
        filename = if (i == 2) "tits_" + i + j + ".txt" else "tits_" + i + ".txt"
        getTits(filename)
      }
      j = j + 1
      if (j == 5) j = 1
      Thread.sleep(1000)
    }

  }

  def clear() = "clear".!

  def getTits(filename: String = "tits.txt"): Unit = {
    for (line <- Source.fromFile(filename).getLines) {
      println(line)
    }
  }

}
