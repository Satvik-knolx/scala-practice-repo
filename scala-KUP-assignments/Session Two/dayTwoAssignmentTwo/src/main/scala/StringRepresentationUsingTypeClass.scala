package com.knoldus

trait Show[userType] {
  def show(usertype: userType): String
}
object StringRepresentationUsingTypeClass {

    implicit val intShow = new Show[Int] {
      def show(intValue: Int) = intValue.toString
    }

    implicit val doubleShow = new Show[Double] {
      def show(doubleValue: Double) = doubleValue.toString
    }

    implicit val longShow = new Show[Long] {
      def show(longValue: Long) = longValue.toString
    }

    case class Position(xInput: Int, yInput: Int)

    implicit val positionShow = new Show[Position] {
      def show(positionValue: Position) = s"Pos(x: ${positionValue.xInput}, y: ${positionValue.yInput})"
    }

  }
