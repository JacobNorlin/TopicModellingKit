package types

/**
  * Created by Jacob on 09-May-17.
  */
case class RawFile(name: String, contents: String)
case class ProcessedFile(name: String, contents: List[String])
case class IndexedFile(name:String, contents: List[Int], vocabulary: Vocabulary)