/**
  * Created by ji.dai on 9/29/16.
  */
object TestString {
  def main(args: Array[String]){
    val s = "scala"
    println(s.drop(2))
    val s2 = raw"haha\nhaha"
    println("s2:" + s2);
    val s3 = "  hello,  world".split(",").map(_.trim)
    s3.foreach(println)

    val result = for {
      c <- "hello, world"
      if c != 'l'
    } yield c.toUpper
    println(result);

    // first example
    val s4 = "HELLO".map(c => (c.toByte+32).toChar)
    println(s4);
    // second example
    val s5 = "HELLO".map{ c =>
      (c.toByte+32).toChar
    }
    println(s5)

    val numPattern = "[0-9][0-9]".r
    val address = "123 Main Street Suite 101"
    val matches = numPattern.findAllIn(address)
    matches.foreach(println);

    val pattern = "([0-9]+) ([A-Za-z]+)".r
    val pattern(count, fruit) = "100 1Bananas"
    println(count);
    println(fruit);
  }
}
