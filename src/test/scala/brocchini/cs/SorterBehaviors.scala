package brocchini.cs

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by mozart on 3/6/16.
  */
trait SorterBehaviors extends Matchers {
  this: FlatSpec =>

  def sortRandomElements(input: Array[Int], sorter: Sorter) {
    it should "sort an array without repeated elements" in {
      sorter.sort(input)
      input(0) should be(1)
      input(1) should be(2)
      input(2) should be(4)
      input(3) should be(5)
      input(4) should be(6)
      input(5) should be(9)
      input(6) should be(10)
    }
  }

  def sortSomeRepeatedElements(input: Array[Int], sorter: Sorter) {
    it should "sort an array with some repeated numbers " in {
      sorter.sort(input)

      input(0) should be(1)
      input(1) should be(5)
      input(2) should be(5)
      input(3) should be(5)
      input(4) should be(6)
      input(5) should be(9)
      input(6) should be(10)
    }
  }

  def notChangeAllRepeatedElements(input: Array[Int], sorter: Sorter) {
    it should "sort an array with all repeated numbers " in {
      sorter.sort(input)

      input(0) should be(5)
      input(1) should be(5)
      input(2) should be(5)
      input.length should be(3)
    }
  }

  def notChangeJust1Element(input: Array[Int], sorter: Sorter) {
    it should "sort an array with just 1 number" in {
      sorter.sort(input)

      input(0) should be(4)
      input.length should be(1)
    }
  }

}
