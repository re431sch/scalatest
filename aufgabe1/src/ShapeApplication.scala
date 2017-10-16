

object ShapeApplication {
  def main(args: Array[String]) {
    var p1 = new Point(3, 4)
    println(p1)
    
    var r1 = new Rectangle(p1)
    r1.height = 5
    r1.width = 9
    println(r1)
    var e1 = new Ellipse(p1)
    e1.height = 7
    e1.width = 2
    println(e1)
    
    var a = new Array[Shape](2)
    a(0) = r1
    a(1) = e1
    
    
  }
        
}