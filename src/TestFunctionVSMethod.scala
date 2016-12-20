/**
  * Created by ji.dai on 11/14/16.
  */
object TestFunctionVSMethod {
  def main(args : Array[String]): Unit = {
    val double = {x:Int => 2 * x}
    //def double (x : Int) = 2 * x
    //val a = double
    println(double(2))
  }

}
