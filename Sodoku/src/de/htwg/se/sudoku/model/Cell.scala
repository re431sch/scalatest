package de.htwg.se.sudoku.model

case class Cell(value: Int) {
  override def toString: String = "value: " + value
  def isSet:Boolean = value != 0

}

case class Field(cells: Array[Cell]) {


}
