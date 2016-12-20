import scala.io.StdIn._
import scala.math._
import scala.collection.mutable.ArrayBuffer
/**
  * Created by ji.dai on 9/8/16.
  */
/*class Point(val xc:Int, val yc:Int) {
  var x: Int = xc;
  var y: Int = yc;

  def move(dx:Int, dy:Int): Unit ={
    x += dx;
    y += dy;
    println(x);
    println(y);
  }
}*/

/*class Location(val xc:Int, val yc:Int, val zc:Int) extends Point(xc:Int, yc:Int){
  val z: Int = zc;
  override def move(dx: Int, dy: Int): Unit = super.move(dx, dy)

}*/


class Point(val xc: Int, val yc: Int) {
  var x: Int = xc
  var y: Int = yc

  def move(dx: Int, dy: Int) {
    x = x + dx
    y = y + dy
  }
  def delayed( t:Long ) = {
    println("In delayed method")
    println("Param: " + t)
  }
  def answer = {
    println("answer");
    40
  }
  def eagerEval(x: Int) = {

    println("eager");
    x;
  }

  def laEval(x: => Int) = {
    //println(x)
    println("lazy");
    x;
  }
}

object demo {
  def main(args: Array[String]) {
/*    val point = new Point(10, 20)
    printPoint

    def printPoint{
      println ("Point x location : " + point.x);
      println ("Point y location : " + point.y);
    }
    //var a = 0;
//    val numList:Int = _
    val numList = List(1,2,3,4,5,6,7,8,9,10);
    var retVal = for{ a <- numList if a != 3; if a < 8 } yield a
        //println("intial:" + a);
    for(b <- retVal){
      println(b);
    }
    //println( "Value of a: " + a );
    println(point.answer);
    println("－－－－－ 分割线 －－－－－")
    point.eagerEval(point.answer )
    println();
    point.laEval(point.answer )*/

   /* val multiplier = (i:Int) => i * 10
    println(multiplier(2));
    var a = "a"
    val b = "b"
    a = a + "a";
    //b = b + "b";
    println(a);*/

    var floatVar = 12.456
    var intVar = 2000
    var stringVar = "Hello, Scala!"

    var fs = printf("The value of the float variable is " +
      "%f, while the value of the integer " + "variable is %d, and the string " +
      "is %s", floatVar, intVar, stringVar)

      println(fs)

      println("Result = \n a \n b")
      var z = Array("Zara", "Nuha", "Ayan")
      println(z(1))
      var myList = Array(1.9, 2.9, 3.4, 3.5)

      val colors = Map("red" -> "#FF0000", "azure" -> "#F0FFFF", "peru" -> "#CD853F")

      val nums: Map[Int, Int] = Map()

    println( "Keys in colors : " + colors.keys )
    println( "Values in colors : " + colors.values )
    println( "Check if colors is empty : " + colors.isEmpty )
    println( "Check if nums is empty : " + nums.isEmpty )


     colors.keys.foreach{ i =>
      print( "Key = " + i )
      println(" Value = " + colors(i) )}

    /*val aList = List(1,2,3,4,5);
    for(iasd <- aList){
      println(iasd)
    }*/

    /*var numberGuess = 0;
    do{
      print("Guess a number : ")

      // You can also use readInt, readDouble, readByte, readShort, readLong,
      //
      numberGuess = readLine.toInt

    } while(numberGuess != 15)*/

    /*printf("You guessed the secret number %d\n", 15)
    def sayHi() : Unit = {
      println("Hi how are you doing")
    }

    sayHi()*/

    //--------------------test ArrayBuffer ------------------
    /*val friends2 = ArrayBuffer[String]()

    // Add an item to the 1st index
    friends2.insert(0, "Phil")

    // Add item to the next available slot
    friends2 += "Mark"

    // Add multiple values to the next available slot
    friends2 ++= Array("Susy", "Paul")

    // Add items starting at 2nd slot
    friends2.insert(1, "Mike", "Sally", "Sam", "Mary", "Sue")

    // Remove the 2nd element
    friends2.remove(1)

    // Remove 2 elements starting at the 2nd index
    friends2.remove(1, 2)

    // Cycle through and print ArrayList or Array
    var friend : String = " "
    for(friend <- friends2)
      println(friend)

    var tupleMarge = (103, "Marge Simpson", 10.25)

    printf("%s owes us $%.2f\n", tupleMarge._2, tupleMarge._3)*/

    // ---------------class------------------

  }
}
