package brocchini.cs.sort

import brocchini.cs.datastruct.IntHeap

/**
  * Created by mozart brocchini on 3/16/2016.
  */
object HeapSort extends Sorter {

  val top = 0

  override def sort(input: Array[Int]): Unit = {
    IntHeap.buildMaxHeap(input)
    moveTopToEnd(input, input.length - 1)
  }

  def moveTopToEnd(input: Array[Int], depth: Int): Unit = {
    swap()
    if (depth > 0) {
      IntHeap.maxHeapify(input, top, depth - 1)
      moveTopToEnd(input, depth - 1)
    }

    def swap(): Unit = {
      val topElement = input(top)
      input(top) = input(depth)
      input(depth) = topElement
    }
  }
}

