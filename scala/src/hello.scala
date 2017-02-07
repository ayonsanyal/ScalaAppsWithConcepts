

class hello extends Equals {
 println("hi");

  def canEqual(other: Any) = {
   other.isInstanceOf[hello]
 }

  override def equals(other: Any) = {
   other match {
     case that: hello => hello.super.equals(that) && that.canEqual(hello.this)
     case _ => false
   }
 }

  override def hashCode() = {
   val prime = 41
   hello.super.hashCode()
 }
}