package types

/**
  * Created by Jacob on 10-May-17.
  */
object UniqBiMap {
  private[UniqBiMap] trait MethodDistinctor
  implicit object MethodDistinctor extends  MethodDistinctor
}

case class UniqBiMap[F, T](map: Map[F, T]){
  def this(tuples: (F, T)*) = this(tuples.toMap)
  private val reverseMap = map map (_.swap)
  require(map.size == reverseMap.size, "no 1 to 1 relation")
  def apply(f: F): T = map(f)
  def apply(t: T)(implicit d: UniqBiMap.MethodDistinctor): F = reverseMap(t)
  val domain = map.keys
  val codomain = reverseMap.keys
}
