package brocchini.cs.datastruct

/**
  * Created by Mozart on 3/12/2016.
  */
object IntHeap {

  def maxHeapify(input: Array[Int], i: Int): Unit = {
    val lPos = left(i)
    val rPos = right(i)
    var largest = if (lPos < input.length && input(lPos) > input(i)) lPos else i
    largest = if (rPos < input.length && input(rPos) > input(largest)) rPos else largest
    if (largest != i) {
      exchange(input, i, largest)
      maxHeapify(input, largest)
    }
  }

  def buildMaxHeap(input: => Array[Int]): Unit = {
    val len = input.length
    for {
      i <- (len / 2) to 0 by -1
    } maxHeapify(input, i)
  }

  def exchange(input: => Array[Int], i: Int, largest: Int): Unit = {
    val iEl = input(i)
    input(i) = input(largest)
    input(largest) = iEl
  }

  def left(pos: Int): Int = {
    2 * pos + 1
  }

  def right(pos: Int): Int = {
    left(pos) + 1
  }
}
