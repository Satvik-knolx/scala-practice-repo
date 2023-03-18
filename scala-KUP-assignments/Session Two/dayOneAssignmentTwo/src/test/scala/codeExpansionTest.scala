package com.knoldus

import org.scalatest.funsuite.AnyFunSuite

class CodeExpansionTest extends AnyFunSuite {
  test("additionTwoNumberExpansion") {
    assert(CodeExpansion.additionTwoNumberExpansion.apply(5, 10) === 15)
  }
  test("sumOfListExpansion") {
    assert(CodeExpansion.sumOfListExpansion(List(3,5,6,7,8,9)) === 38)
  }
  test("sumOfListEmpty") {
    val list = List()
    try {
      if (list.isEmpty) throw new Exception("List is empty")
    } catch {
      case exception: Exception => println("An error occurred " + exception.getMessage)
    }
    assert(CodeExpansion.sumOfListExpansion(List()) === 0)
  }
  test("higherOrderFunctionExpansion") {
    val addOne = (x: Int) => x + 1
    assert(CodeExpansion.higherOrderFunctionExpansion(addOne, 1) === 2)
  }

}
