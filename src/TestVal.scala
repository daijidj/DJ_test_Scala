/**
  * Created by ji.dai on 11/3/16.
  */

object TestVal {
  def main(args : Array[String]) : Unit = {
    println(test())
    println(math.sqrt(11))
  }

  def test(): Int ={
    lazy val c = d
    lazy val d = 2
    c
  }

}

