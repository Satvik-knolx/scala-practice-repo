package com.knoldus

import scala.annotation.tailrec

object factorialUsingRecursion extends App {

  @tailrec  //this annotation is used to verify whether the method is using tail recursion or not
  def recursiveFactorial(factorialNumber: Int, acc: Int): Int = { //acc is an accumulator which is used to store the immediate result of computation
      if (factorialNumber == 0)
        acc
      else
        recursiveFactorial(factorialNumber - 1, acc * factorialNumber)
  }

}
