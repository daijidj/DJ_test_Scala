/**
  * Created by ji.dai on 9/9/16.
  */
trait Equal {
  def isEqual(x: Any): Boolean
  def isNotEqual(x: Any): Boolean = !isEqual(x)
}

class Point2(xc: Int, yc: Int) extends Equal {
  var x: Int = xc
  var y: Int = yc

  def isEqual(obj: Any) = obj.isInstanceOf[Point] && obj.asInstanceOf[Point].x == y
}

class test()
object Demo {
  def main(args: Array[String]) {
    val p1 = new Point2(2, 3)
    val p2 = new Point2(2, 4)
    val p3 = new Point2(3, 3)

    println(p1.isNotEqual(p2))
    println(p1.isNotEqual(p3))
    println(p1.isNotEqual(2))
    println(matchTest(2));
    val pattern = "Scala".r()
    val str = "Scala is Scalable and cool"

    println(pattern findAllIn str)
    println(scala.math.log(1.4));
  }
  def matchTest(x: Any): Any = x match {
    case 1 => "one"
    case "two" => 2
    case y: Int => "scala.Int"
    case _ => "many"
  }
}
