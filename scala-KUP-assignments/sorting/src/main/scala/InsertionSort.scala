package com.knoldus

object InsertionSort extends App {
  // Insertion Sort
  def insertionSort(list: List[Int]): List[Int] = {
    if (list.isEmpty) {
      // If the list is empty, return the empty list
      list
    } else {
      val head = list.head
      val tail = list.tail
      val sortedTail = insertionSort(tail)
      insert(head, sortedTail)
    }
  }

  def insert(elementOfList: Int, list: List[Int]): List[Int] = {
    if (list.isEmpty || elementOfList <= list.head) {
      // If the list is empty or the current element is less than or equal to the head, insert the current element at the beginning
      elementOfList :: list
    } else {
      // Otherwise, recursively insert the current element into the tail
      list.head :: insert(elementOfList, list.tail)
    }
  }
}
