package com.knoldus

import scala.annotation.tailrec

object BubbleSort extends App {
  def sort(list: List[Int]): List[Int] = {
    def adjacentSwap(array: List[Int]): List[Int] = array match {
      case Nil => Nil
      case head :: Nil => List(head)
      case head1 :: head2 :: tail =>
        if (head1 > head2) head2 :: adjacentSwap(head1 :: tail)
        else head1 :: adjacentSwap(head2 :: tail)
    }

    @tailrec
    def bubbleSort(array: List[Int], swapped: Boolean): List[Int] = array match {
      case Nil => Nil
      case _ =>
        val swappedArray = adjacentSwap(array)
        if (swappedArray == array) array
        else bubbleSort(swappedArray, swapped = true)
    }

    bubbleSort(list, swapped = true)
  }
}