package brocchini.cs.sort

/**
  * Created by mozart on 3/6/16.
  */
object InsertionSort extends Sorter{

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
}
