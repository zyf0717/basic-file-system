package com.zyf0717.scala.oop.commands
import com.zyf0717.scala.oop.files.{DirEntry, Directory}
import com.zyf0717.scala.oop.filesystem.State

class Mkdir(name: String) extends CreateEntry(name) {

  override def createSpecificEntry(state: State): DirEntry =
    Directory.empty(state.wd.path, name)
}
