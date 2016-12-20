import java.math.RoundingMode
import java.text.DecimalFormat

/**
  * Created by ji.dai on 10/3/16.
  */

object TestDouble{
  def main(args: Array[String]): Unit ={
    println((1272.21212 / Math.pow(10, 1.0.toInt)).toInt)
    println(java.lang.Math.log1p(72.2))

    println(math.pow(2, 6.173926931999809))
    /*println(1.toDouble)
    println("123.4".toDouble)
    println("123".toDouble)
    println(1.1.toInt)
    println("1".toDouble.toInt)
    println("1.0".toDouble.toInt)
    println(1.1.toString)
    println(1.toString)*/

    /*var format = "#."
    for(i <- 1 to 2){
      format += "#"
    }
    val dformat:DecimalFormat = new DecimalFormat(format)
    dformat.setRoundingMode(RoundingMode.DOWN)
    println(dformat.format(11.328323))*/

    //println(math.round(342.123 / Math.pow(10, 2))* math.pow(10, 2))
    println(math.floor(312.123 * 100)/100)
    println(312.123/math.pow(10, -2.0.toInt).toInt)
  }
  /*var vec= Vector(5.1,3.5,1.4,0.2)
  val a = vec.toArray
  var res = a(0);
  for(i <- 1 to (a.length - 1)){
    res /= a(i)
  }*/
  /*println(res)
  println(2.7.ceil);
  println(math.ceil(2.3))
  println(2.7.floor);
  println(math.floor(2.3))
  println(-2.3.toInt);
  println(-2.7.toInt);
  println(math.exp(5.1));
  println("tan:" + math.tan(90));
  //println(math.exp(-1))
  //println(math.exp(1))
  println(Double.MinValue)
  println(5.5/2.7)
  println("123.4".toDouble.toInt)
  println("abc".toInt)*/

}
