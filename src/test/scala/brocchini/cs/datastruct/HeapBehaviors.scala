package brocchini.cs.datastruct

import org.scalatest.{FlatSpec, Matchers}

import scala.collection.mutable.ListBuffer

/**
  * Created by mbrocchini on 3/15/2016.
  */
trait HeapBehaviors extends Matchers {
  this: FlatSpec =>

  def arrangeItemsLikeHeap(input: ListBuffer[Int], exercise: ListBuffer[Int] => Unit) {
    it should " arrange the items like a heap " in {
      exercise(input)
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
}
