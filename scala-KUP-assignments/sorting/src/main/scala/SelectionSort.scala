package com.knoldus

object SelectionSort extends App {
  def selectionSort(list: List[Int]): List[Int] = {
    if (list.isEmpty) {
      // If the list is empty, return the empty list
      list
    } else {
      val min = list.min
      val rest = list.filter(_ != min)
      // Recursively sort the remaining elements and add the minimum element at the beginning
      min :: selectionSort(rest)
    }
  }

}
