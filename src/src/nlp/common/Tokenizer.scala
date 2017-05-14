package nlp.common

import types.{PreProcessContext, PreProcessPipeline}

/**
  * Created by Jacob on 09-May-17.
  */
object Tokenizer extends PreProcessPipeline[String, List[String]]{

  def run(ctx: PreProcessContext)(text: String): List[String] = {
    tokenize(text)
  }

  def tokenize(s: String) : List[String] = s.split(" ") toList

}
