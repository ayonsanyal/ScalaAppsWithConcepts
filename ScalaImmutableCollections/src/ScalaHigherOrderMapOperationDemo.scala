

object ScalaHigherOrderMapOperationDemo extends App {
  
  
  val listOfDays = List("Mon","Tue","Wed","Thu","Fri","Sat")
  //The _ operator here does the responsibolity of binding of each element of collection in place of the _
  listOfDays.foreach {println(_) }
  
  // this operation demstrates the map operation on listOfDays
  
  listOfDays.map(v=>{v=="Mon"}:Boolean)
  
  
  
  
}