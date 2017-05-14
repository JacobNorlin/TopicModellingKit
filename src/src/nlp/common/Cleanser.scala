package nlp.common

import sun.reflect.generics.reflectiveObjects.NotImplementedException
import types.{PreProcessContext, PreProcessPipeline}

/**
  * Created by Jacob on 09-May-17.
  *
  * Removes all garbage from a document and sets case
  */
object Cleanser extends PreProcessPipeline[String, String]{

  def run(ctx: PreProcessContext)(text: String): String = {
    cleanse(text)
  }

  /**
    * REMOVE HERESY
    * @param s
    * @return
    */
  def cleanse(s: String): String = {
    stripPunctuation(s) toLowerCase
  }

  private def stripPunctuation(s: String) = s.replaceAll("""[\p{Punct}&&[^.]]""", "")
}
