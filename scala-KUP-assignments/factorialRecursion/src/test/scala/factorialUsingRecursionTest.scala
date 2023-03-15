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
  test("In order to find the factorial number should be greater than or equal to 0") {
    assertThrows[IllegalArgumentException]  {
      factorialUsingRecursion.recursiveFactorial(-2,1)
    }
  }

}
