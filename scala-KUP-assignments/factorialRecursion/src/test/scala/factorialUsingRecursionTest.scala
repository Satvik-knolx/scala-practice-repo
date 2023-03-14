package com.knoldus
import org.scalatest.funsuite.AnyFunSuite

class factorialUsingRecursionTest extends AnyFunSuite {
  test("to check if result is correct for 5") {
    assert(factorialUsingRecursion.recursiveFactorial(5, 1) === 120)
    println(factorialUsingRecursion.recursiveFactorial(5,1))
  }
  test("to check if result is correct for 0") {
    assert(factorialUsingRecursion.recursiveFactorial(0, 1) === 1)
    println(factorialUsingRecursion.recursiveFactorial(0,1))

  }

}
