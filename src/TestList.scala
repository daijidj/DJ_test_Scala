/**
  * Created by ji.dai on 11/9/16.
  */
object TestList {
  def main(args : Array[String]): Unit ={
    /*val list = List(1, 2, 3)
    squareList1(list).foreach(println)
    squareList2(list).foreach(println)*/

    val list = List(0,0) :: List(1,2) ::: List(2,3) :: List(4)
    //val a = list.flatten

    println(list.toString())
    /*val list = List(2, -4, 5, 7, 1)
    println(list.map(x => x - 1).toString())
    squareList1(list).foreach(println)
    squareList2(list).foreach(println)
    println(list.filter(x => x > 0).toString())
    println(list.filterNot(x => x > 0).toString())
    println(list.partition(x => x > 0).toString())
    println(list.takeWhile(x => x > 0).toString())
    println(list.dropWhile(x => x > 0).toString())
    println(list.span(x => x > 0).toString())
    println(encode(List("a", "a", "a", "b", "c", "c", "a")).toString())*/
    val a = List(1,2)
    val b =   3 +: a
    println(a)
  def squareList1(xs : List[Int]) : List[Int] = xs match {
    case Nil => xs
    case y :: ys => y * y :: squareList1(ys)
  }

  def squareList2(xs : List[Int]) : List[Int] = xs.map(x => x * x )

    def encode [T](xs : List[T]) : List[(T, Int)] = xs match{
      case Nil => Nil
      case x :: xs1 =>
        val (first, rest) = xs.span(y => y == x)
        (x , first.length):: encode(rest)
    }
    /*val a = List(1,2,3)
    val b = List(5,6,7)
    var c = a ::: b
    c = c :+ 9
    c = c.reverse
    var d = c
    d.updated(1, 12)
    //c.foreach(println)
    d.foreach(println)
    println(d.indexOf(2))
    println(d.contains(13))*/


    /*val a = List('a', 'b', 'a')
    val map = a.groupBy(x => x)
    map.foreach(println)*/

    /*var myList = List[Double]() // -20, -19, -18, ... 18, 19, 20
    var λLowerBound = -2.0
    var λUpperBound = 2.0
    while(λLowerBound <= λUpperBound){
      myList = myList :+ λLowerBound
      λLowerBound += 0.1
    }
    println(myList.size)
    myList.foreach(println)*/
  }
}
