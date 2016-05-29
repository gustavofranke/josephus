package com.gustavo

object Main {
  def main(args: Array[String]) = {
    require(args.length == 2, "\n Usage: sbt \"<number of people in the circle> <step rate>\"")

    val n = args(0).toInt
    val k = args(1).toInt


    println(s"""\nWelcome! your input parameters are:\n - number of people in the circle (n): $n \n - step rate (k): $k""")
    println(s"""\nThe place you need to stand in the circle to be the last person left is: ${CountingOut.getPlaceToStandInTheCircle(n, k)}\n""")
  }
}
