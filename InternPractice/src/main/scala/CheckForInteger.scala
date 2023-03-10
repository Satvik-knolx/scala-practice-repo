import scala.Console.println
import scala.io.StdIn

object CheckForInteger extends App {
  private var countVariable: Int = 0
  println("Please provide an input to check whether it is number or string: ")
  private val inputFromUser = StdIn.readLine()

  private def checkForNumber(): Boolean = {
    for (index <- 0 until inputFromUser.length()) {
      if (48 < inputFromUser.charAt(index) || inputFromUser.charAt(index) <= 57) {
        countVariable = countVariable + 1
      }


    }
    if (countVariable != 0) {
      true
    } else {
      false
    }

  }
  println(checkForNumber())
}


