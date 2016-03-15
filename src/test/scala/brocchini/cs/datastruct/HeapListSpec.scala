package brocchini.cs.datastruct

import java.util

import org.scalatest.{Matchers, FlatSpec}
import scala.collection.JavaConversions._

/**
  * Created by mbrocchini on 3/15/2016.
  */
class HeapListSpec extends FlatSpec with Matchers {

  "A heap list " should " arrange items in list according to heap order" in {
    val intHeap = new Heap[Int]

    val input = util.Arrays.asList(4, 1, 3, 2, 16, 9, 10, 14, 8, 7)
    intHeap.buildMaxHeap(input)
    input(0) should be(16)
    input(1) should be(14)
    input(2) should be(10)
    input(3) should be(8)
    input(4) should be(7)
    input(5) should be(9)
    input(6) should be(3)
    input(7) should be(2)
    input(8) should be(4)
    input(9) should be(1)

  }

}
