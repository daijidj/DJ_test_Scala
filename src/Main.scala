

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = {
      if( c == 0){
        return 1
      }
      if(c > r){
        0
      }else{
        pascal(c - 1, r - 1) + pascal(c, r - 1)
      }
    }
  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {
      def balanceCheck(chars : List[Char], left :Int): Boolean = {
        if(left < 0){
          return false
        }
        if(chars.isEmpty){
          left == 0;
        }
        else{
          if(chars.head == '('){
            balanceCheck(chars.tail, left + 1)
          }else{
            if(chars.head == ')'){
              balanceCheck(chars.tail, left - 1)
            }else{
              balanceCheck(chars.tail, left)
            }
          }
        }
      }
      balanceCheck(chars, 0)
    }
  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = {
      val sortedCoins = coins.sorted
      var count = 0

      def backTracking( target:Int, start:Int, coins:List[Int]) : Unit = {
        if(target < 0){
          return
        }
        if(target == 0){
          count += 1
        }
        for(i <- start to coins.length - 1){
          backTracking(target - coins(i), i, coins)
        }
      }
      backTracking(money, 0, coins)
      count
    }
  }
