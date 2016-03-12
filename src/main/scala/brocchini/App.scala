package brocchini

import brocchini.cs.sort.{InsertionSort, MergeSort}

/**
  * Created by mozart on 3/6/16.
  */
object App extends App {

  override def main(args: Array[String]) {
    demoInsertionSort()
  }

  def demoInsertionSort(): Unit = {
    val input = Array(9, 5, 6, 1, 10, 4, 2)
    println(s"input[${input.mkString(",")}]")

    MergeSort.sort(input)
    println(s"sorted[${input.mkString(",")}]")
  }
}
