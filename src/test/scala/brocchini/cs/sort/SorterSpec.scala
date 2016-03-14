package brocchini.cs.sort

import brocchini.cs.sort._
import brocchini.cs.sort.sort._
import org.scalatest.FlatSpec

/**
  * Created by mozart on 3/6/16.
  */
class SorterSpec extends FlatSpec with SorterBehaviors {

  def alreadySortedArray = {
    Array(1, 2, 4, 5, 6, 9, 10)
  }

  def invertedOrderArray = {
    Array(10, 9, 6, 5, 4, 2, 1)
  }

  def outOfOrderArray = {
    Array(9, 5, 6, 1, 10, 4, 2)
  }

  def someRepeated: Array[Int] = {
    Array(9, 5, 6, 1, 10, 5, 5)
  }

  def arrayAllRepeated: Array[Int] = {
    Array(5, 5, 5)
  }

  def just1 = {
    Array(4)
  }

  lazy val javaSorter = InsertSort.sorter
  lazy val javaMergeSorter = new MergeSorter

  "InsertionSort sorting sorted array" should behave like sortRandomElements(alreadySortedArray, InsertionSort)
  "InsertionSort sorting inverted array" should behave like sortRandomElements(invertedOrderArray, InsertionSort)
  "InsertionSort sorting out of order array" should behave like sortRandomElements(outOfOrderArray, InsertionSort)
  "InsertionSort array of just 1 number" should behave like notChangeJust1Element(just1, InsertionSort)
  "InsertionSort array of all repeated numbers" should behave like notChangeAllRepeatedElements(arrayAllRepeated, InsertionSort)

  "InsertionSort2 sorting sorted array" should behave like sortRandomElements(alreadySortedArray, InsertionSort2)
  "InsertionSort2 sorting inverted array" should behave like sortRandomElements(invertedOrderArray, InsertionSort2)
  "InsertionSort2 sorting out of order array" should behave like sortRandomElements(outOfOrderArray, InsertionSort2)
  "InsertionSort2 array of just 1 number" should behave like notChangeJust1Element(just1, InsertionSort2)
  "InsertionSort2 array of all repeated numbers" should behave like notChangeAllRepeatedElements(arrayAllRepeated, InsertionSort2)

  "MergeSort sorting sorted array" should behave like sortRandomElements(alreadySortedArray, MergeSort)
  "MergeSort sorting inverted array" should behave like sortRandomElements(invertedOrderArray, MergeSort)
  "MergeSort sorting out of order array" should behave like sortRandomElements(outOfOrderArray, MergeSort)
  "MergeSort array of just 1 number" should behave like notChangeJust1Element(just1, MergeSort)
  "MergeSort array of all repeated numbers" should behave like notChangeAllRepeatedElements(arrayAllRepeated, MergeSort)

  "javaSorter sorted" should behave like sortRandomElements(alreadySortedArray, javaSorter)
  "javaSorter inverted" should behave like sortRandomElements(invertedOrderArray, javaSorter)
  "javaSorter sorting out of order array" should behave like sortRandomElements(outOfOrderArray, javaSorter)
  "javaSorter sorting array of just 1 number" should behave like notChangeJust1Element(just1, javaSorter)
  "javaSorter sorting array of all repeated numbers" should behave like notChangeAllRepeatedElements(arrayAllRepeated, javaSorter)

  "MergeSort java sorting sorted array" should behave like sortRandomElements(alreadySortedArray, javaMergeSorter)
  "MergeSort java sorting inverted array" should behave like sortRandomElements(invertedOrderArray, javaMergeSorter)
  "MergeSort java sorting out of order array" should behave like sortRandomElements(outOfOrderArray, javaMergeSorter)
  "MergeSort java array of just 1 number" should behave like notChangeJust1Element(just1, javaMergeSorter)
  "MergeSort java array of all repeated numbers" should behave like notChangeAllRepeatedElements(arrayAllRepeated, javaMergeSorter)
}
