package types

/**
  * Created by Jacob on 09-May-17.
  */
class Vocabulary(files: List[ProcessedFile]) {


  val map: UniqBiMap[Int, String] = UniqBiMap(files
    .flatMap(file => file.contents)
    .distinct
    .zipWithIndex
    .map{case(word, i) => (i, word)}
    .toMap)


  def getWord(i: Int): String = map(i)
  def getId(s: String): Int = map(s)

}
