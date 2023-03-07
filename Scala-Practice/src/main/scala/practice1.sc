class Employee(firstName:String,lastName:String){
}
val employee = new Employee("Satvik", "Gupta")
employee
employee.toString

//Additional Constructor
class Hello(message:String){
  def this()=this("Hello There!!!")
  println(message)
}