package brocchini.insertionsort

import org.scalatest.{Matchers, FlatSpec}

/**
  * Created by mozart on 3/6/16.
  */
class InsertionSortSpec extends FlatSpec with Matchers {

  "InsertionSort  " should "sort an array already sorted " in {
    val input = Array(1,2,4,5,6,9,10)
    InsertionSort.sort(input)

    input(0) should be (1)
    input(1) should be (2)
    input(2) should be (4)
    input(3) should be (5)
    input(4) should be (6)
    input(5) should be (9)
    input(6) should be (10)
  }

  "InsertionSort  " should "sort an array with inverted order " in {
    val input = Array(10,9,6,5,4,2,1)
    InsertionSort.sort(input)

    input(0) should be (1)
    input(1) should be (2)
    input(2) should be (4)
    input(3) should be (5)
    input(4) should be (6)
    input(5) should be (9)
    input(6) should be (10)
  }

  "InsertionSort  " should "sort an array out of order " in {
    val input = Array(9, 5, 6, 1, 10, 4, 2)
    InsertionSort.sort(input)

    input(0) should be (1)
    input(1) should be (2)
    input(2) should be (4)
    input(3) should be (5)
    input(4) should be (6)
    input(5) should be (9)
    input(6) should be (10)
  }

  "InsertionSort  " should "sort an array with some repeated numbers " in {
    val input = Array(9, 5, 6, 1, 10, 5, 5)
    InsertionSort.sort(input)

    input(0) should be (1)
    input(1) should be (5)
    input(2) should be (5)
    input(3) should be (5)
    input(4) should be (6)
    input(5) should be (9)
    input(6) should be (10)
  }

  "InsertionSort  " should "sort an array with all repeated numbers " in {
    val input = Array(5, 5, 5)
    InsertionSort.sort(input)

    input(0) should be (5)
    input(1) should be (5)
    input(2) should be (5)
  }

  "InsertionSort  " should "sort an array with just 1 number" in {
    val input = Array(4)
    InsertionSort.sort(input)

    input(0) should be (4)
  }

}
