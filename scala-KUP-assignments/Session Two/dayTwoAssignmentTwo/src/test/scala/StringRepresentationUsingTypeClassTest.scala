package com.knoldus
import  StringRepresentationUsingTypeClass._
import org.scalatest.funsuite.AnyFunSuite

class StringRepresentationUsingTypeClassTest extends AnyFunSuite {
  test("Test case 1") {
    assert(StringRepresentationUsingTypeClass.intShow.show(56) == "56")
  }
  test("Test case 2") {
    assert(StringRepresentationUsingTypeClass.doubleShow.show(3.14) == "3.14")
  }

  test("Test case 3") {
    assert(StringRepresentationUsingTypeClass.longShow.show(9809808098210983L) == "9809808098210983")
  }
  test("Test case 4") {

    val position = new Position(0, 1)
    val positionString = positionShow.show(position)
    val expected = "Pos(x: 0, y: 1)"
    assert(positionString === expected)
  }
}