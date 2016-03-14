package brocchini.cs.sort.datastruct

/**
  * Created by Mozart on 3/12/2016.
  */
object IntHeap {

  def maxHeapify(input: Array[Int], i: Int): Unit = {
    val lPos = left(i)
    val rPos = right(i)
    val largest = biggest(input, i, lPos, rPos)
    if (largest != i) {
      exchange(input, i, largest)
      maxHeapify(input, largest)
    }
  }

  def biggest(input: Array[Int], i: Int, lPos: Int, rPos: Int): Int = {
    val largest = if (lPos < input.length && input(lPos) > input(i)) lPos else i
    if (rPos < input.length && input(rPos) > input(largest)) rPos else largest
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

  def left(i: Int): Int = {
    2 * i + 1
  }

  def right(i: Int): Int = {
    left(i) + 1
  }

  def parent(i: Int): Int = {
    (i -1) / 2
  }
}
