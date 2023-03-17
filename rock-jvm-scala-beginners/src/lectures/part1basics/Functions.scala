package lectures.part1basics

import scala.collection.IterableOnce.iterableOnceExtensionMethods


object Functions extends App{
  def aFunction (parameterA: String, parameterB: Int): String = {
    parameterA + " " + parameterB
  }
  println(aFunction("Monday:",13))

  def aParameterLessFunction(): Int = 42
  println(aParameterLessFunction())
  //OR
  println(aParameterLessFunction)

  def aRepeatedFunction(aString: String, number: Int): String= {
      if (number == 1)
        aString
      else
        aString + aRepeatedFunction(aString, number - 1)

  }
  println(aRepeatedFunction(" called Recursively",3))

//  def squareListOne(list: List[Int]): List[Int] =
//    list match {
//      case Nil => ??
//      case h :: t => ??
//    }




  def anyOperation = ???
  //Recursion is the replacement for loops in scala

  /* String interpolation concepts
  val nameOfCandidate: String = "Satvik"
  val ageOfCandidate: Int = 25
  val preciseAgeOfCandidate: Double = 25.3d
  println(raw"My name is $nameOfCandidate.\n I am $preciseAgeOfCandidate years old.")
  println(s"My name is $nameOfCandidate.\n I am $preciseAgeOfCandidate years old.")
  println(f"My name is $nameOfCandidate%s.\n I am $preciseAgeOfCandidate%1.2f years old.")
*/
}
