package brocchini.cs.sort

/**
  * Created by mozart on 3/9/16.
  */
object MergeSort extends Sorter{

  val sentinel = -1

  /** This interface mutates the input just so I can reuse #brocchini.cs.SorterBehaviors tests */
  override def sort(input: Array[Int]): Unit = {
    val sorted = sortInt( input )
    mutateInputJustToReuseTests(input, sorted)
  }

  private[this] def mutateInputJustToReuseTests(input: Array[Int], sorted: Array[Int]): Unit = {
    sorted.foldLeft(0) { (i, e) => input(i) = e; i + 1 }
  }

  def sortInt(input: Array[Int]) : Array[Int] = {
    if (input.length ==1) input else {
      val (left, right) = split(input)
      merge( sortInt(left), sortInt(right) )
    }
  }

  /** Very imperative */
  def merge(left: Array[Int], right: Array[Int]):Array[Int] = {
    val result = new Array[Int](left.length + right.length)
    var l = 0 ; var r = 0
    var i = 0
    while(i < result.length){
      if (l==left.length){
        result(i) = right(r)
        r += 1
      } else if (r==right.length){
        result(i) = left(l)
        l += 1
      } else if (left(l)<=right(r)){
        result(i) = left(l)
        l += 1
      } else {
        result(i) = right(r)
        r += 1
      }
      i += 1
    }
    result
  }

  def split(input: Array[Int]) : (Array[Int],Array[Int]) = {
    val sizeL = input.length / 2
    val sizeR = input.length - sizeL
    val left = new Array[Int](sizeL)
    val right = new Array[Int](sizeR)

    for {
      l <- 0 until sizeL
    } left(l) = input(l)
    for {
      r <- 0 until sizeR; i = r+sizeL
    } right(r) = input(i)
    (left,right)
  }
}

