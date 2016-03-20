package brocchini

import brocchini.cs.datastruct.IntHeap
import brocchini.cs.sort.HeapSort

/**
  * Created by mozart on 3/6/16.
  */
object App extends App {

  override def main(args: Array[String]) {
    demoInsertionSort()
  }

  def demoInsertionSort(): Unit = {
    val input = Array(4,1,3,2, 16, 9, 10,14,8,7)
    println(s"input[${input.mkString(",")}]")

    IntHeap.buildMaxHeap(input)
    HeapSort.sort(input)
    println(s"sorted[${input.mkString(",")}]")
  }
}
