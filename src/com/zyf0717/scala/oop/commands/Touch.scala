package com.zyf0717.scala.oop.commands
import com.zyf0717.scala.oop.files.{DirEntry, File}
import com.zyf0717.scala.oop.filesystem.State

class Touch(name: String) extends CreateEntry(name) {

  override def createSpecificEntry(state: State): DirEntry =
    File.empty(state.wd.path, name)
}
