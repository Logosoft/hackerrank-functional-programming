// https://www.hackerrank.com/challenges/functional-programming-warmups-in-recursion---gcd/problem

package recursion.functional_programming_warmups_in_recursion___gcd

object Solution {
  def main(args: Array[String]): Unit = {
    /** The part relates to the input/output. Do not change or modify it **/
    acceptInputAndComputeGCD(readLine().trim().split(" ").map(x => x.toInt).toList)
  }

  /** This part handles the input/output. Do not change or modify it **/
  def acceptInputAndComputeGCD(pair: List[Int]): Unit = {
    println(gcd(pair.head, pair.reverse.head))
  }

  def gcd(x: Int, y: Int): Int = {
    @scala.annotation.tailrec
    def innerGcd(a: Int, b: Int): Int = if (b == 0) a else innerGcd(b, a % b)

    val (a, b) = if (x > y) (x, y) else (y, x)
    innerGcd(a, b)
  }

  // There is a bug in HackerRank. readLine() doesn't exist anymore in the predefined Solution.
  // So I add it manually.
  def readLine(): String = scala.io.StdIn.readLine()
}

