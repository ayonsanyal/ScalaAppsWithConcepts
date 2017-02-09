

/**
 * @author AYON SANYAL
 * This demo will cover the utilities of scan ,scan right and scan left 
 *
 */
object ScalaScanFoldMethodDemo extends App {
  val listOfDays = List(1,2,3,7,0,76,5)
  //It is same as scan left
  val scanValue = listOfDays.scan(0)(_+_)
  val foldValue = listOfDays.fold(0)(_+_)
  println(foldValue)
  println(scanValue)
  //The right associative value takes the initiAL value and then input and pairs it accordingly 
  val scanValueRight = listOfDays.scanRight(0)(_+_)
  val FoldValueRight = listOfDays.foldRight(0)(_+_)
  println(scanValueRight)
  println(FoldValueRight)
  //The right associative value takes the initiAL value and then input and pairs it accordingly
  val scanValueLeft = listOfDays.scanLeft(0)(_+_)
  val foldvalueLeft = listOfDays.foldLeft(0)(_+_)
  println(scanValueLeft)
  println(foldvalueLeft)
  
}