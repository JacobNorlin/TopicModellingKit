package types

import java.io.File

import com.sun.org.apache.xalan.internal.xsltc.cmdline.getopt.GetOpt.Option

/**
  * Created by Jacob on 14-May-17.
  */
trait Context

case class PreProcessContext(
                            dataPath: String,
                            stoplistPath: String,
                            minNumWords: Int,
                            outDir: Option[File]
                            ) extends Context
