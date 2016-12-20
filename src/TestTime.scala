import java.text.SimpleDateFormat
import java.util.Date

/**
  * Created by ji.dai on 10/25/16.
  */
object TestTime {
  def main(args : Array[String]) : Unit = {
    val dateRegex = """([0-9]{4}-[0-9]{2}-[0-9]{2})"""
    val timeRegex = """([0-9]{2}:[0-9]{2}:[0-9]{2}.[0-9]{2})"""
    val DateOnly = dateRegex.r
    val DateTime = (dateRegex + " " + timeRegex).r

    var patternWithTime = "yyyy-MM-dd HH:mm:ss";
    var formatterWithTime = new SimpleDateFormat(patternWithTime);

    val patternDateOnly = "yyyy-MM-dd"
    var formatterDateOnly = new SimpleDateFormat(patternDateOnly);

    def get(s:String) = s match {
      case DateTime(d,t) => {
        formatterWithTime.parse(s)
      }
      case DateOnly(d) => {
        formatterDateOnly.parse(s)
      }
    }


    println(get("2011-06-30"))


    println(get("2011-06-30 16:32:19.45"))
    /*val dateRegex = """([0-9]{4}-[0-9]{2}-[0-9]{2})"""
    val timeRegex = """([0-9]{2}:[0-9]{2}:[0-9]{2}.[0-9]{3})"""
    val DateOnly = dateRegex.r
    val DateTime = (dateRegex + " " + timeRegex).r
    def get(s:String) = s match {
      case DateTime(d,t) => d + "*" + t
      case DateOnly(d) => d + " 00:00:00.000"
    }

    println(get("2011-06-30"))


    println(get("2011-06-30 16:32:19.452"))
  */
  }

}
