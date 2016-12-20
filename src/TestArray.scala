/**
  * Created by ji.dai on 10/14/16.
  */
import Array._
object TestArray {
  def main(args: Array[String]): Unit ={
    var test :Array[Int] = Array(256,255)
    test.foreach(println)
    var myLists = range(-20, 21, 1)
    for ( x <- myLists ) {
      print( " " + x )
    }
  }
}
