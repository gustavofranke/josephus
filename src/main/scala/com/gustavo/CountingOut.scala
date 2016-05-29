package com.gustavo

object CountingOut {
  def getPlaceToStandInTheCircle(n: Int, k: Int): Int = {
    require(n >= 1, "\n Usage: number of people in the circle (n) has to be greater than 1")
    require(k >= 0, "\n Usage: step rate (k) has to be greater than 0")

    (n, k) match {
      case (1, _) => 1
      case (_, _) => ((getPlaceToStandInTheCircle(n - 1, k) + k - 1) % n) + 1
    }
  }
}