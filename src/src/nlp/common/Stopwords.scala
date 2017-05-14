package nlp.common

import sun.reflect.generics.reflectiveObjects.NotImplementedException
import types.{PreProcessContext, PreProcessPipeline}

/**
  * Created by Jacob on 09-May-17.
  */
object Stopwords extends PreProcessPipeline[List[String], List[String]]{

  def run(ctx: PreProcessContext)(tokenized : List[String]) : List[String] = {
    removeStopWords(tokenized)
  }

  def removeStopWords(s: List[String]) : List[String] = {
    throw NotImplementedException
  }

}
