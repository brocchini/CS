package brocchini.cs.datastruct

import brocchini.cs.sort.datastruct.IntHeap
import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by mozart on 3/13/16.
  */
class HeapSpec extends FlatSpec with Matchers {

  "A heap" should " position array elements like a binary tree" in {
    val input = Array(4,1,3,2, 16, 9, 10,14,8,7)
    IntHeap.buildMaxHeap(input)
    input(0) should be (16)
    input(1) should be (14)
    input(2) should be (10)
    input(3) should be (8)
    input(4) should be (7)
    input(5) should be (9)
    input(6) should be (3)
    input(7) should be (2)
    input(8) should be (4)
    input(9) should be (1)
  }

}