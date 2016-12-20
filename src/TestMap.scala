/**
  * Created by ji.dai on 10/14/16.
  */
object TestMap {
  def main(args: Array[String]) :Unit = {
    /*var list = List(1,2,3,4,5)
    val array = list.toArray
    def times2( l : List[Int]) = l.map(x => x * 2)
    times2(list)
    for(i <- array){
      print(i)
    }

    val myMap = Map("a" -> 42, "b" -> 43)
    myMap.get("a").map("value found" + _).getOrElse("no value found")*/
    var seq = Seq(0,1,2,3,4,1,1,2)
    var countMap : Map[Int, Int] =  Map()
    for(i <- seq){
      if(countMap.contains(i)){
        countMap += (i -> (countMap(i) + 1))
      }else{
        countMap += (i -> 1)
      }
    }
    val countSeq = countMap.toList.sortBy(_._1)
    countSeq.foreach{
      case (x,y) => println(s"key: $x, value: $y")
    }
    var rankMap : Map[Int, Double] = Map()
    var rank = 1
    for(i <- countSeq){
      val num = i._1
      val count = i._2
      if(count == 1){
          rankMap += (num -> rank)
        rank += 1
      }else{
        rankMap += num -> ((rank + (rank + count - 1)).toDouble / 2)
        rank += count
        println("rank" + rank)
      }
    }
    rankMap.foreach(println)
  }

}
