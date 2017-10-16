

class Ellipse(p: Point) extends AbstractShape {
  
  override def getArea: Double = return width * height * 3.14
 
  
  override def toString = "Ellipse:\n" + super.toString
}