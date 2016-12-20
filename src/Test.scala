/**
  * Created by ji.dai on 9/7/16.
  */
import java.text.SimpleDateFormat
import java.util.Date;
import java.util.Calendar;

object Test {
  /* This is my first java program.
  * This will print 'Hello World' as the output
  */
  def main(args: Array[String]) {
    println("Hello, world!") // prints Hello World
    println("Hello\n\tWorldc\n" );
    val (myVar1, myVar2) = Pair(40, "Foo")
    println(myVar1)
    println(scala.math.log(1.4));
    val list = List.range(1,5);

    println(list);
    val c = scala.math.cos _
    println(c(0))
    c(0)
    val y = BigInt(8839200231L)
    val dy: BigInt = 3284386755L
    println(dy % 101);

    val date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance.getTime)
    //val date2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(2015)
    println(date);

    println(Calendar.getInstance.getTime);
    var date2 = new SimpleDateFormat("dd-yyyy-MM HH:mm:ss").format(Calendar.getInstance.getTime)
    println(date2);
    date2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance.getTime)
    println(date2);
    var date3: Date = new SimpleDateFormat("dd-yyyy-MM hh:mm:ss").parse("2016-09-19 13:47:04")
    println(date3);

    //val date3 = new SimpleDateFormat("mm-YYYY HH:mm:ss").format("2016-09-19 13:12:17")
    //println(date2);
    var date4 = new Date();



    println("---------");

/*    val expectedPattern = "yyyy-MM-dd";
    var formatter = new SimpleDateFormat(expectedPattern);

      // (2) give the formatter a String that matches the SimpleDateFormat pattern
      val userInput = "2012-12-01";
      val date5 : Date= formatter.parse(userInput);

      // (3) prints out "Tue Sep 22 00:00:00 EDT 2009"
      System.out.println("**date5:" + date5);
    var simpleDateFormat = new SimpleDateFormat("dd");

    System.out.println("DAY "+simpleDateFormat.format(date5));
    var day = simpleDateFormat.format(date5)
    println("day type:" + day.getClass)
    simpleDateFormat = new SimpleDateFormat("MM");
    System.out.println("MONTH "+simpleDateFormat.format(date5));

    simpleDateFormat = new SimpleDateFormat("y");
    System.out.println("YEAR "+simpleDateFormat.format(date5));*/

    /*println(math.exp(1));
    println(math.log1p(2.718281828459045 - 1));*/
    println(1 < 1);
  }
}
