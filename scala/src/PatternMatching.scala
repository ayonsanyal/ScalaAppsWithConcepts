

object PatternMatching {
  
  /** This is a demo for showing pattern matching on type value or condition
   *  An error will be thrown if at least one case is not matched.
 * @param args
 */
def main(args: Array[String]):Unit =
  {
    val dayOfTheWeek ="Tuesday"
    val typeOfTheWeek = dayOfTheWeek match {
      case "Monday" =>"Scary Monday"
      case "Tueaday" => "Speedy Tuesday"
      case someOtherDay => {
        println(s"Some other day - neither Saturday nor Wednesday ,its $someOtherDay")
      }
    }
  }
}