import scala.collection.mutable

/**
 * Created by sree on 13/09/14.
 */
object StringMingling {

    def main(args: Array[String]) {
      /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/  def concatfunction(l1:String, l2:List[Char], l3: List[Char]): String = (l2,l3) match {
        case (a::lq , b::le) =>  concatfunction(l1+a+b,lq,le)
        case (Nil,Nil) =>  l1

      }

      println(concatfunction("",readLine.toList,readLine.toList));
    }
  }
