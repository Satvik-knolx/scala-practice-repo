package com.knoldus

import scala.annotation.tailrec

object factorialUsingRecursion extends App {

  @tailrec  //this annotation is used to verify whether the method is using tail recursion or not
  def recursiveFactorial(factorialNumber: Int, factorialValue: Int): Int = { //factorialValue is an accumulator which is used to store the immediate result of computation
      if  (factorialNumber < 0) {
        throw new IllegalArgumentException("In order to find the factorial number should be greater than or equal to 0") //provided exception if number is less than 0
      } else if (factorialNumber == 0)
        factorialValue
      else
        recursiveFactorial(factorialNumber - 1, factorialValue * factorialNumber)
  }
}
