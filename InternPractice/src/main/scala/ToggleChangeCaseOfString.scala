import scala.Console.println
import scala.io.StdIn

object ToggleChangeCaseOfString extends App {
  try {
    println("Enter string to change the case of its elements: ")
    val inputFromUser = StdIn.readLine()
    var result = ""

    // function to change the case of a given string
    def stringToChangeCase(stringToChangeCaseOf: String): String = {
      // throw an error if the input string is empty
      if (stringToChangeCaseOf.isEmpty) {
        throw new IllegalArgumentException("Empty string is not allowed.")
      }

      // throw an error if the input string contains only numbers
      if (stringToChangeCaseOf.matches("[0-9]+")) {
        throw new IllegalArgumentException("Only string allowed")
      }

      // iterate through the input string and change the case of each character
      for (indexOfString <- 0 until stringToChangeCaseOf.length()) {
        if (65 <= stringToChangeCaseOf.charAt(indexOfString) && stringToChangeCaseOf.charAt(indexOfString) <= 90) {
          result = result + (stringToChangeCaseOf.charAt(indexOfString).toInt + 32).toChar
        } else if (97 <= stringToChangeCaseOf.charAt(indexOfString) && stringToChangeCaseOf.charAt(indexOfString) <= 122) {
          result = result + (stringToChangeCaseOf.charAt(indexOfString).toInt - 32).toChar
        }
      }
      result
    }

    // print the result of the stringToChangeCase function
    println(stringToChangeCase(inputFromUser))

  } catch {
    // catches and throws message if input is a number or no input
    case numberOrEmptyStringError: IllegalArgumentException => println(s"Error: ${numberOrEmptyStringError.getMessage}")

    // if some other error occurred
    case defaultError: Exception => println(s"An error occurred: ${defaultError.getMessage}")
  }
}
