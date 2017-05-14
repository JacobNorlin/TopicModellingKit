package nlp.common

import types.{IndexedFile, Pipeline, ProcessedFile, Vocabulary}

/**
  * Created by Jacob on 10-May-17.
  */
object Indexer extends Pipeline[List[ProcessedFile], List[IndexedFile]]{

  def run(ctx: Any)(files: List[ProcessedFile]): List[IndexedFile] = {
    indexFiles(files)
  }

  def indexFiles(files: List[ProcessedFile]): List[IndexedFile] = {
    val vocabulary = new Vocabulary(files)
    files.map(file => {
      val contents = file.contents.map(vocabulary.getId)
      IndexedFile(file.name, contents, vocabulary)
    })
  }

}
