package com.knoldus

import scala.language.postfixOps

object squareListElement extends App {

  def squareListMap(list: List[Int]): List[Int] = {
      val squaredMap = (listElement: Int) => (listElement * listElement)
      list.map(squaredMap)
  }

  def squareListMatch(list: List[Int]): List[Int] =
    list match {
      case Nil => Nil
      case headList :: tailList =>  headList * headList :: squareListMatch(tailList)
    }
}
