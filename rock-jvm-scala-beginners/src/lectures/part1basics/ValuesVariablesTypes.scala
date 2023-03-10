package lectures.part1basics

object ValuesVariablesTypes extends App {

  private val immutableVariable: Int = 42
  println(immutableVariable)

  //  immutableVariable = 24
  //  immutableVariable is immutable as it is assigned a value using val keyword

  private var mutableVariable: Int = 24
  println(mutableVariable)
  //  mutableVariable is mutable(changeable) as it is assigned a value using a var keyword
  mutableVariable = 25
  println(mutableVariable)
  //  value of mutableVariable is changed

  private val unassignedVariable = 90
  println(unassignedVariable)
  //  here we didn't provide the type of variable but compiler can automatically infer the types
  //  val unassignedVariable2 : Int = "This will throw an error as we have provided the type and trying to assign value of different type"
  private val unassignedVariable2: String = "Hello there!!!" ; println(unassignedVariable2)
  /*  when we want to write multiple expressions in the same line then they are separated by using ';'
      but this is not encouraged as a good practice
 */

  //  Some of the data types present in scala are:
  private val aString: String = "This is a string"
  println(aString)
  private val anInt: Int = 10
  println("This is a int with value " + anInt)

  val aBoolean: Boolean= true
  val anotherBoolean: Boolean = false
  println("This boolean returns either " + aBoolean + " or " + anotherBoolean)

  val aChar: Char = 'a'
  println("This is a char whose value is: " + aChar)

  val aShort: Short = 9999
  println("This is a short data type whose value is: " + aShort)

  val aLong: Long = 99999999999999999L
  println("This is a long data type whose value is: " + aLong)

  val aFloat: Float = 2.0f
  println("This is a float data type whose value is: " + aFloat)

  val aDouble: Double = 3.14d
  println("This is a double data type whose value is: " + aDouble)
}