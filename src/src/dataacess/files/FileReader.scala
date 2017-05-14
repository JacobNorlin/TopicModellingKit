package dataacess.files

import types._

import scala.io.Source

/**
  * Created by Jacob on 09-May-17.
  */
object FileReader extends Pipeline[String, List[RawFile]]{

  def run(ctx: Any)(path: String) = {
    val contents = readFile(path)
    List(RawFile(path, contents))
  }

  def readFile(path: String) = {
    Source.fromFile(path).mkString
  }

}
