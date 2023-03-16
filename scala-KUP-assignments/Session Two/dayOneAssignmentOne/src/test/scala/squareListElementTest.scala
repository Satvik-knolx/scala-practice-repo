package com.knoldus

import org.scalatest.funsuite.AnyFunSuite

class squareListElementTest extends AnyFunSuite {

  test("squareListElementMap") {
    assert(squareListElement.squareListMap(List(1, 2, 3, 4)) === List(1, 4, 9, 16))
  }

  test("squareListElementMapEmpty") {
    val list = List()
    try {
      if (list.isEmpty) throw new Exception("List is empty")
    } catch {
      case exception: Exception => println("An error occurred " + exception.getMessage)
    }
    assert(squareListElement.squareListMap(List()) === List())
  }

  test("squareListElementPatternMatch") {
    assert(squareListElement.squareListMatch(List(3, 2, 4, 5)) === List(9, 4, 16, 25))
  }

  test("squareListElementPatternMatchEmpty") {
    val list = List()
    try {
      if (list.isEmpty) throw new Exception("List is empty")
    } catch {
      case exception: Exception => println("An error occurred " + exception.getMessage)
    }
    assert(squareListElement.squareListMatch(List()) === List())
  }
}
