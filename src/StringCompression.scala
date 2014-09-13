/**
 * Created by sree on 13/09/14.
 */
object StringCompression {
  def main(args: Array[String]) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
    def compression(msg:List[Char]):String  = msg match {
      case m::msg1 => val(first,rest) = msg span (head => m == head) ; if(first.length > 1) first.head.toString + first.length + compression(rest) else first.head + compression(rest)
      case Nil => ""
     }
    var list = compression(readLine().toList);
    println(list)

   }
}
