

/**
 * @author AYON SANYAL
 *This demo will cover the utilities of reduce function
 */
object ScalaReduceMethodDemo extends App {
  val listOfDays = List(1,2,3,7,0,76,5)
  //It is same as scan left
  
  val foldValue = listOfDays.reduce(_+_)
  println(foldValue)

  //The right associative value takes the initiAL two values 
  
  val FoldValueRight = listOfDays.reduceRight(_+_)
  
  println(FoldValueRight)
  //The left associative value takes the initiAL two values
  
  val foldvalueLeft = listOfDays.reduceLeft(_+_)
  
  println(foldvalueLeft)
  
}