import scala.Console.println
import scala.io.StdIn

object PalindromicString extends App {

  try {
    println("Please input a string to check for panidrome: ")
    // Read input from the user
    val inputFromUser = StdIn.readLine()

    // Check if the input string is a palindrome
    def checkForPalindrome(stringToBeCheckedForPalindrome: String): Boolean = {
      if (stringToBeCheckedForPalindrome.isEmpty()) {
        throw new IllegalArgumentException("Empty string is not allowed.")
      }
      if (stringToBeCheckedForPalindrome.matches("[0-9]+")) {
        throw new IllegalArgumentException("Only string allowed")
      }
      for (indexOfString <- 0 until stringToBeCheckedForPalindrome.length / 2) {
        if (stringToBeCheckedForPalindrome(indexOfString) != stringToBeCheckedForPalindrome(stringToBeCheckedForPalindrome.length - indexOfString - 1)) {
          return false
        }
      }
      true
    }

    println(if (checkForPalindrome(inputFromUser)) "YES" else "NO")
	
	
  } catch {
  	//cathes and throws message if input is number or no input
    case numberOrEmptyStringError: IllegalArgumentException => println(s"Error: ${numberOrEmptyStringError.getMessage}")

	//if something else error occurred
    case defaultError: Exception => println(s"An error occurred: ${defaultError.getMessage}")
  }
}

