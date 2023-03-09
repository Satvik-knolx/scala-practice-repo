import scala.Console.println
import scala.io.StdIn

object ProfilePicture extends App {
  try {
    // read input values
    println("Please enter the length of the square")
    val inputOfLengthOfSquare = StdIn.readInt()
    println("Please enter the width of the photo")
    val inputOfWidthOfPhoto = StdIn.readInt()
    println("Please enter the height of the photo")
    val inputOfHeightOfPhoto = StdIn.readInt()

    // function to validate photo upload
    def photoUpload(lengthOfSquare: Int, widthOfPhoto: Int, heightOfPhoto: Int): String = {
      // check if inputs are greater than zero
      if (lengthOfSquare <= 0 || widthOfPhoto <= 0 || heightOfPhoto <= 0) {
        throw new ArithmeticException("Length of Square, Width of Photo and Height of Photo must be greater than zero.")
      }
      // check if photo fits exactly into square space provided
      else if (lengthOfSquare == widthOfPhoto && lengthOfSquare == heightOfPhoto) {
        "Photo accepted and uploaded successfully"
      }
      // check if photo is smaller than the space provided
      else if (lengthOfSquare > widthOfPhoto || lengthOfSquare > heightOfPhoto) {
        "Photo dimension is less than space provided, please upload another one"
      }
      // check if photo is larger than the space provided
      else {
        "Provided photo dimension is larger than the provided space, CROP IT "
      }
    }

    // print the output of the photoUpload function
    println(photoUpload(inputOfLengthOfSquare, inputOfWidthOfPhoto, inputOfHeightOfPhoto))
  } catch {
    // catches and throws message if input is a number or no input
    case sizeZeroOrNegative: ArithmeticException => println(s"Error: ${sizeZeroOrNegative.getMessage}")

    // if some other error occurred
    case defaultError: Exception => println(s"An error occurred: ${defaultError.getMessage}")
  }
}
