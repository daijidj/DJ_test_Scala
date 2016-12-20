/**
  * Created by ji.dai on 11/3/16.
  */
object TestFunctional extends App{
  val array = new Array[Int](3)
  array(0) = 1
  array(1) = 2
  array(2) = 3
  def transform(f: Int => Int, array: Array[Int]) = {
    for(i <- 0 to array.length - 1){
      array(i) = f(array(i))
      println(f(i))
    }
  }
  transform(x => 2 * x, array)
  println(array.mkString(", "))

}
