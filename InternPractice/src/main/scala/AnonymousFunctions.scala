

object AnonymousFunctions extends App {
  private val doublingValues: Int => Int = (doubledNumber: Int) => doubledNumber * 2

  private val checkAgeOfIndividual: (Int,String) => String = (ageOfIndividual: Int, nameOfIndividual:String ) => {
    if(ageOfIndividual < 20)  {
      nameOfIndividual + "'s age is less than 20"
    } else  {
      nameOfIndividual + "'s age is more than 20"
    }

  }

  println(checkAgeOfIndividual(20, "Satvik"))
  println(checkAgeOfIndividual(18, "Sheshnath"))

  private val number: (Int, Int) => String = (firstNumber:Int, secondNumber:Int) =>(firstNumber * secondNumber) + " String"
  println(number(2,4))
  println(doublingValues(2))
}

