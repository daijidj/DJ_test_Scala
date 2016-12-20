/**
  * Created by ji.dai on 10/4/16.
  */
object TestFold {
  def main(args: Array[String]): Unit ={
    val numbers = List(5, 4, 8, 6, 2)
    val res = numbers.fold(11) { (z, i) =>
      z + i
    }
    println(res)
    println(Math.log(3.3))
  }
}
