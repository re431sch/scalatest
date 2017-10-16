

class Rectangle(p: Point) extends AbstractShape {
  
  override def getArea: Double = return width * height
  
  override def toString = "Rectangle:\n" + super.toString
  
}