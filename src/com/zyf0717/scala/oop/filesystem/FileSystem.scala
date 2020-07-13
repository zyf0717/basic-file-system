package com.zyf0717.scala.oop.filesystem

import java.util.Scanner

import com.zyf0717.scala.oop.commands.Command
import com.zyf0717.scala.oop.files.Directory

object FileSystem extends App {

  val root = Directory.ROOT
  val initialState = State(root, root)
  initialState.show()
  io.Source.stdin
    .getLines()
    .foldLeft(initialState)((state, line) => {
      val newState = Command.from(line).apply(state)
      newState.show()
      newState
    })

//  var root = Directory.Root
//  var state = State(root, root)
//  val scanner = new Scanner(System.in)
//
//  while (true) {
//    state.show()
//    val input = scanner.nextLine()
//    state = Command.from(input).apply(state)
//  }
}
