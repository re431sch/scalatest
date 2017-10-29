package de.htwg.se.yourgame
import de.htwg.se.sudoku.model.Player

object Sodoku {
  def main(args: Array[String]): Unit = {
    val student = Player("Hans")
    println("Hello, " + student.name)
  }
}
