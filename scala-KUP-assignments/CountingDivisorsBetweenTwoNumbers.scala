import scala.io.StdIn

object CountingDivisorBetweenTwoNumbers extends App {

  // read the three inputs from the user
  println("Please provide value of first number")
  val firstNumberInput: Int = StdIn.readInt()
  
  println("Please provide value of second number")
  val secondNumberInput: Int = StdIn.readInt()
  
  println("Please provide value of third number")
  val thirdNumberInput: Int = StdIn.readInt()

  try {
    // throw an exception if the first number is greater than the second
    if (firstNumberInput > secondNumberInput) {
      throw new Exception("First number cannot be greater than second number.")
    }

    // count the number of divisors between the first and second input that are divisible by the third input
    def numberOfDivisors(firstNumberInput: Int, secondNumberInput: Int, thirdNumberInput: Int): Int = {
      var countOfDivisors = 0
      for (index <- firstNumberInput to secondNumberInput) {
        if (index % thirdNumberInput == 0) {
          countOfDivisors = countOfDivisors + 1
        }
      }
      countOfDivisors
    }

    // print the result
    println("Number of counts of divisors between first number and second number is: ")
    print(numberOfDivisors(firstNumberInput, secondNumberInput, thirdNumberInput))
  }
  catch {
    // catch any exceptions that occur and print an error message
    case e: Exception =>
      println("An error occurred : " + e.getMessage)
  }
}
