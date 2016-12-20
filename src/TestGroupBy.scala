/**
  * Created by ji.dai on 11/30/16.
  */
object TestGroupBy {
  def main(args: Array[String]) : Unit = {
    val word = "abababac"
    val wordList = word.groupBy((char : Char) => char).toList.sortBy(_._1)
    val a = for(char <- wordList) yield (char._1, char._2.length )
    a.foreach(println)
  }
}
