

/**
 * @author AYON SANYAL
 * This object represents higher order functions and first class function example
 * The results are tested in scala interpreter and hence working fine
 *
 */
object HigherOrderAndFirstClassFunctionsExample {
  
  

  def compareString(s1:String,s2:String):Int ={if(s1==s2) 0 else if(s1>s2) 1 else {-1}}


  def compareStringDescending(s1:String,s2:String):Int ={if(s1==s2) 0 else if(s1>s2) -1 else {1}}


  compareStringDescending("fbv","abc")


  compareString("fbv","abc")


  def smartCompare(s1:String,s2:String, firstclassob:(String,String)=>Int):Int ={firstclassob(s1,s2)}


  smartCompare("abc","fvg",compareString)


  def getComparator(reverse:Boolean):(String,String)=>Int ={ if (reverse) compareString else{compareStringDescending} }


  val comValue = getComparator(true)


  comValue("abc","fvg")


  
}