/**
  * Created by ji.dai on 11/21/16.
  */
object TestSum {
  def main(args: Array[String]): Unit = {
    val a = sumCubes
    a
    println(sumCubes(1,4))
  }

  def sum(f : Int => Int) : (Int ,Int) => Int = {
    def sumF(a : Int, b : Int) : Int =
      if(a > b) 0
      else f(a) + sumF(a + 1, b)
    sumF
  }

  def sumCubes = sum(x => x * x * x)
}
