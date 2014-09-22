/**
 * Created by sree on 13/09/14.
 */
object SuperDigit {
  def qs(n: BigInt): BigInt = n.toString.foldLeft(BigInt(0))((n, ch) => n + (ch - '0').toInt)

  def main(args: Array[String]) {
    val input = scala.io.Source.stdin.getLines

    val nk = input.next.split(" ").map(BigInt(_))
    val (n, k) = (nk(0), nk(1))

    println(Stream.iterate(k * qs(n))(qs(_)).find(_ < 10).get)
  }
io.Source.stdin
}