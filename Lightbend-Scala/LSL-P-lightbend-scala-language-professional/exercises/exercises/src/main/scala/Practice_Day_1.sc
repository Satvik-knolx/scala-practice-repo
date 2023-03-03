var message = "Hello There"
println(message)

message = "reassigning to check whether message is mutable"
print(message)

val variableOne = 10
val variableTwo = 10
if(variableOne==variableTwo) "variableOne is equal to variableTwo" else "both are variableOne and variableTwo are not equal"

//Code Blocks
val value = {
  variableTwo + variableTwo
}

val lightweight =
  if("Scala" startsWith "S")  {
    val scala = "Scala"
    val is = "is"
    val lightWeight = "lightweight"
    scala + " " + is + " " + lightWeight
  } else  {
    "Then it cant happen, because Scala != Java"
  }

class HelloClass

val helloClass = new HelloClass

helloClass.toString
