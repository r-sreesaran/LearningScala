/**
 * Created by sree on 13/09/14.
 */
object SuperDigit {
  def main(args: Array[String]) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/  def generateString (no:String,re:Int , tot:Int , temp:String):String = {
      if(tot-1>re) generateString(no+temp,re+1,tot,temp)
         else no
        }
    def totalSum(no:List[Char]):Int = no match {
      case x::xs =>  x.asDigit+totalSum(xs)
      case Nil => '0'.asDigit


     }

    def tot(no:List[Char]):Int = no match {
      case _ if no.length == 1=> no.head.asDigit
      case no => tot(totalSum(no).toString.toList)

    }
    val no = readLine()
    var gy=  no.split(" ")
    println(gy.toList.head)

   //println(generateString("148",0,3,"148"))
   // println(tot(generateString(no(0),0,no(1).toInt,no(0)).toList).toInt)
  }
}
