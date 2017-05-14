package nlp.common

import types.{PreProcessContext, PreProcessPipeline, ProcessedFile, RawFile}

import language.postfixOps
/**
  * Created by Jacob on 09-May-17.
  */
object TextProcessing extends PreProcessPipeline[List[RawFile], List[ProcessedFile]]{


  val preProcessPipeline = Cleanser andThen Tokenizer andThen Stopwords

  def run(ctx: PreProcessContext)(files: List[RawFile]): List[ProcessedFile] = {
    files.map(file => {
      val processedContents = preProcessPipeline.run(ctx)(file.contents)
      ProcessedFile(file.name, processedContents)
    })
  }

}
