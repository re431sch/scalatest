package de.htwg.se.sudoku
import de.htwg.se.sudoku.model.Player
import de.htwg.se.sudoku.model.Cell
import de.htwg.se.sudoku.model.Field

object Sudoku {

  def main(args: Array[String]): Unit = {
    val student = Player("Your Name")
    println("Hello, " + student.name)
    /*val cell1 = Cell(4,5)
    val cell2 = Cell(3,2)
    println(cell1)*/

   /* val field1 = Field(Array.ofDim[Cell](2))
    field1.cells(0) = cell1
    field1.cells(0).x
    field1.cells(0).y
    field1.cells(1) = cell2
    println(field1.cells(0))
    println(field1.cells(1))*/

    val cell1 = Cell(2)
    println(cell1.isSet)
    val cell2 = Cell(0)
    println(cell2.isSet)
  }
}