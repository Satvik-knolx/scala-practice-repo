package com.knoldus

import org.scalatest.funsuite.AnyFunSuite

object SortingTest extends AnyFunSuite{
  test("Testing for BubbleSort")  {
    assert(BubbleSort.sort(List(5,2,4,3,7,6)) === List(2,3,4,5,6,7))
  }
  test("Testing for SelectionSort") {
    assert(SelectionSort.selectionSort(List(5,2,3,1,4,6)) === List(1,2,3,4,5,6))
  }
  test("Testing for InsertionSort") {
    assert(InsertionSort.insertionSort(List(5,2,3,1,4,6)) === List(1,2,3,4,5,6))
  }
}
