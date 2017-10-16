

abstract class AbstractShape extends Shape{
  
  var center: Point = new Point(0,0)
  var height: Double = 0.0
  var width: Double = 0.0
  
  override def getArea: Double
  override def getCenter: Point = return center
  override def getHeight: Double = return height
  override def getWidth: Double = return width
  override def setCenter(p: Point) = center = p
  override def setHeight(d: Double) = height = d
  override def setWidth(d: Double) = width = d
  
  override def toString : String = "h: " + height + ", w: " + width + ", c: " + center + ", a: " + getArea
  
}