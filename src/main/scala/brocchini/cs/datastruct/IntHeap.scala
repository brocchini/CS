package brocchini.cs.datastruct

/**
  * Created by Mozart on 3/12/2016.
  */
object IntHeap {

  def maxHeapify(input: Array[Int], i: Int, depth: Int): Unit = {
    val largest = biggest(input, i, depth)
    if (largest != i & largest <= depth) {
      exchange(input, i, largest)
      maxHeapify(input, largest, depth)
    }
  }

  def biggest(input: Array[Int], i: Int, depth: Int): Int = {
    val leftIdx = left(i)
    val rightIdx = right(i)
    val largest = if (leftIdx <= depth && input(leftIdx) > input(i)) leftIdx else i
    if (rightIdx <= depth && input(rightIdx) > input(largest)) rightIdx else largest
  }

  def buildMaxHeap(input: => Array[Int]): Unit = {
    val len = input.length
    for {
      i <- (len / 2) to 0 by -1
    } maxHeapify(input, i, len - 1)
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
    (i - 1) / 2
  }
}
