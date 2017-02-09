

/**
 * @author AYON SANYAL
 * This app demonstrates the use of collections like List and Map and to
 * show their utilities with output
 *
 */
object ListandCollectionsDemo extends App {
  
//  This demo shows the map insertion and iteration
  val listdemo = List(1,3,2,5,6);
  val listdemo2= List(1,3,2,5,6,7);
  println((listdemo zip listdemo2))
  for(c <- listdemo){
    println(c)
  }
//  This demo shows the map insertion and iteration
 var mapDemo = Map("1"->"2","scv"->"njk",("nmj","nhmk"))
// Keys and values can be inserted in two ways as shown above
 var mapprint= mapDemo.foreach((c:(String,String))=>println(c._1+"="+c._2))
println(mapDemo.keySet.toList)
}