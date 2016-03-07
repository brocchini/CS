package brocchini.insertionsort

/**
  * Created by mozart on 3/6/16.
  */
object InsertionSort {


  /**
    *  Very imperative just to read like the algorithm description
   */
  def sort(input: Array[Int]): Unit  = {
    for (i <- 1 until input.length) {
      var left = i - 1
      val key = input(i)
      while ( left >= 0 && key < input(left) ) {
          input(left+1) = input(left)
        left = left -1
      }
      input(left+1) = key
    }
  }

  /**
    * More declarative, no mutable variables
    * Still mutating input
    */
  def sort2(input: Array[Int]): Unit  = {
    for {
      i <- 1 until input.length; key = input(i)
    } insert(key,i-1)

    def insert(key:Int, left:Int): Unit = {
      if (left >= 0 && key < input(left)) {
        input(left + 1) = input(left)
        insert(key ,left-1)
      } else {
        input(left+1) = key
      }
    }
  }


}
