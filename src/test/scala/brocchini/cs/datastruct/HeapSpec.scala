package brocchini.cs.datastruct

import java.util

import org.scalatest.FlatSpec

import scala.collection.JavaConversions._
import scala.collection.mutable.ListBuffer

/**
  * Created by mozart on 3/13/16.
  */
class HeapSpec extends FlatSpec with HeapBehaviors {
  val intHeap = new Heap[Int]
  val f = (l: ListBuffer[Int]) => intHeap.buildMaxHeap(l)
  val input = util.Arrays.asList(4, 1, 3, 2, 16, 9, 10, 14, 8, 7)

  "A heap " should behave like arrangeItemsLikeHeap(ListBuffer(input: _*), f)

}