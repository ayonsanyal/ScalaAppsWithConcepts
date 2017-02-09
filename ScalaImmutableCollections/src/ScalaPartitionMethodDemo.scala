

/**
 * @author AYON SANYAL
 * This demo shows the use of partition method and its output
 *
 */
object ScalaPartitionMethodDemo extends App {
  
  val listOfDays = List("Mon","Tue","Wed","Thu","Fri","Sat")
  val partitionValue = listOfDays.partition(x=>(x=="Fri"))
  println(partitionValue)
  //(List(Fri),List(Mon, Tue, Wed, Thu, Sat)) 
  //This is the expected output
}