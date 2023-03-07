val vector = Vector(1,2,3)
Vector("1","2")
Vector("1",2)
Seq(1,2,3,4)
Set(4,5,'9')
val sequence=Seq[Int](1,2,3)

case class Station(name:String)

case class Train(kind:String,number:Int,schedule:Seq[Station]){
  require(schedule.take(2).size == 2,"Schedule should contain atleast 2 elements")
}
val str="abc"
var temp=""
for(i <- 0 until str.size){
  temp=str.charAt(i)+temp
}
//println(temp)
if(temp == str){
  println("Yes")
}else {
  println("No")
}

