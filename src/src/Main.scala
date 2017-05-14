import dataacess.files.FileReader
import nlp.common.{Indexer, TextProcessing}
import types.Pipeline
/**
  * Created by Jacob on 09-May-17.
  */
object Main {

  val indexPipeline = FileReader andThen TextProcessing andThen Indexer

  def main(args: Array[String]): Unit ={
    val files = indexPipeline.run()(args(0))
  }

}
