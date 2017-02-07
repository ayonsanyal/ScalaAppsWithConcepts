

/**
 * @author AYON SANYAL
 * This program shows the first element of an array using tail recursion in scala
 */
object FindFirst {
  def main(args:Array[String]):Unit={
    println(findFirst(Array(7,9,13),(x:Int)=>x==9))
  }
  
  def findFirst[A](ds: Array[A],p: A=>Boolean):Int={
    @annotation.tailrec
    def loop(n:Int):Int=
    if(n>ds.length)-1
    else if(p(ds(n)))n
    else loop(n+1)
    
    loop(0)
    
    }
  
  
}