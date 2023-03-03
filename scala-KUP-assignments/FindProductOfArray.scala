//This program finds the product of elements of array provided by the user and prints it

import scala.io.StdIn

object FindProductOfArray extends App {
  val initialValueOfProduct: Int = 1
  
  def calculateProductOfArray(arrayValues: Array[Int]): Int = {
    var productOfArray = initialValueOfProduct
    for (indexOfArray <- arrayValues) {
      productOfArray *= indexOfArray
    }
    productOfArray
  }

  println("Enter the number of elements in the array:")
  val sizeOfArray = StdIn.readInt()

  val inputOfArray = new Array[Int](sizeOfArray)
  println("Enter the values of the array:")
  for (index <- 0 until sizeOfArray) {
    inputOfArray(index) = StdIn.readInt()
  }

  val productOfArray = calculateProductOfArray(inputOfArray)
  println("The product of the elements of the array is " + productOfArray)	
}

