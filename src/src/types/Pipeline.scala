package types

/**
  * Created by Jacob on 09-May-17.
  */
trait Pipeline[C, -F, +T] {
  self =>

  def andThen[G](thenn: Pipeline[C, T, G]): Pipeline[C, F, G] = new Pipeline[C, F, G] {
    def run(ctx : C)(v : F) : G = {
      val first = self.run(ctx)(v)
      thenn.run(ctx)(first)
    }
  }

  def run(ctx: C)(v: F): T
}

abstract class PreProcessPipeline[-F, +T] extends Pipeline[PreProcessContext, F, T]