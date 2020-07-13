package com.zyf0717.scala.oop.commands
import com.zyf0717.scala.oop.filesystem.State

class Pwd extends Command {
  override def apply(state: State): State = state.setMessage(state.wd.path)
}
