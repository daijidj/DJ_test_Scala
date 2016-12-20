/**
  * Created by ji.dai on 10/24/16.
  */
object TestCallByName {
  def main(args : Array[String]) : Unit = {
    //println(constOne(1 + 2, loop))
    //println(constOne(loop, 1 + 2))
    def x = loop
    //println(x)
    println(and(false, x))
  }
  def loop : Boolean = loop
  def constOne(x : Int, y : => Int) = 1
  def and (x : Boolean, y : => Boolean) = {
    if(x){
      y
    }else{
      false
    }
  }

  def or (x : Boolean, y : => Boolean) = {
    if(x){
      x
    }else{
      y
    }
  }
  (x1 : Int, x2 : Int) => x1 + x2
  def f (x1 : Int, x2 : Int) = x1 + x2;

}
