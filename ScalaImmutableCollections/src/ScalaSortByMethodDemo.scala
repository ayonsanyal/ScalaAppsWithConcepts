

object ScalaSortByMethodDemo extends App {
  val listOfDays = List("Mon","Tue","Wed","Thu","Fri","Sat")
  val sprtedValues = listOfDays.sortBy(_(2))
  println(sprtedValues)
}