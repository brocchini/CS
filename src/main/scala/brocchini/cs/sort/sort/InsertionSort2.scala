package brocchini.cs.sort.sort

/**
  * Created by mbrocchini on 3/7/2016.
  */
object InsertionSort2 extends Sorter {

  /**
    * More declarative, no mutable variables
    * Still mutating input
    */
  override def sort(input: Array[Int]): Unit  = {
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
