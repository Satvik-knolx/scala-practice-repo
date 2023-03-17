package com.knoldus

object CodeExpansion  {
  //  val additionTwoNumber: (Int, Int) => Int = (numberOne: Int, numberTwo: Int) => numberOne + numberTwo
  // Expansion of above method
  try {
    val additionTwoNumberExppansion: Function2[Int, Int, Int] = new Function2[Int, Int, Int] {
      def apply(numberOne: Int, numberTwo: Int): Int =
        if (numberOne.getClass != Int || numberTwo.getClass != Int)
          throw new Exception("Please provide only integer")
        else {
          numberOne + numberTwo
        }
    } catch {

      }
  }

  //  val sumOfList: List[Int] => Int = (list: List[Int]) => list.sum
  // Expansion of above method
  val sumOfListExpansion: Function1[List[Int], Int] = new Function1[List[Int], Int] {
      def apply(list: List[Int]): Int = list.sum
  }

  //  val higherOrderFunction: (Int => Int, Int) => Int = (function: (Int => Int), num: Int) => function(num)
  // Expansion of above method
  val higherOrderFunctionExpansion: Function2[Int => Int, Int, Int] = new Function2[Int => Int, Int, Int] {
    def apply(function: Int => Int, num: Int): Int = function(num)
  }
}
