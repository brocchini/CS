package brocchini

import brocchini.cs.sort.datastruct.IntHeap

/**
  * Created by mozart on 3/6/16.
  */
object App extends App {

  override def main(args: Array[String]) {
    demoInsertionSort()
  }

  def demoInsertionSort(): Unit = {
    //val input = Array(9, 5, 6, 1, 10, 4, 2)
    val input = Array(4,1,3,2, 16, 9, 10,14,8,7)
    println(s"input[${input.mkString(",")}]")

    //MergeSort.sort(input)
    IntHeap.buildMaxHeap(input)
    println(s"sorted[${input.mkString(",")}]")
  }
}
