

object ScalaFilterOperationDemo extends App {
  val listOfDays = List("Mon","Tue","Wed","Thu","Fri","Sat")
  var filetrValue=listOfDays.filter { x => x=="Mon" }
  //The filter method will return the condition which met true
  println(filetrValue)
}