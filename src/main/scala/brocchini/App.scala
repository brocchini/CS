package brocchini

import brocchini.insertionsort.InsertionSort

/**
  * Created by mozart on 3/6/16.
  */
object App extends App {


  override def main(args: Array[String]) {
    demoInsertionSort

  }

  def demoInsertionSort: Unit = {
    val input = Array(9, 5, 6, 1, 10, 4, 2)
    println(s"input[${input.mkString(",")}]")

    InsertionSort.sort2(input)
    println(s"sorted[${input.mkString(",")}]")
  }
}
