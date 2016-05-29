package com.gustavo

class CountingOutSpec extends org.specs2.mutable.Specification {
  "This is the CountingOut#getPlaceToStandInTheCircle specification" >> {
    "Where Invalid parameters are passed" >> {
      CountingOut.getPlaceToStandInTheCircle(-1, 5) must throwA[java.lang.IllegalArgumentException]
      CountingOut.getPlaceToStandInTheCircle(3, -1) must throwA[java.lang.IllegalArgumentException]
    }
    "Where n = 3, and k = 2" >> {
      CountingOut.getPlaceToStandInTheCircle(3, 2) must_== 3
    }
    "Where n > k" >> {
      CountingOut.getPlaceToStandInTheCircle(2, 5) must_== 2
      CountingOut.getPlaceToStandInTheCircle(3, 5) must_== 1
      CountingOut.getPlaceToStandInTheCircle(4, 5) must_== 2
      CountingOut.getPlaceToStandInTheCircle(3, 10) must_== 2
    }
    "Where n < k" >> {
      CountingOut.getPlaceToStandInTheCircle(5, 2) must_== 3
      CountingOut.getPlaceToStandInTheCircle(5, 3) must_== 4
      CountingOut.getPlaceToStandInTheCircle(5, 4) must_== 1
      CountingOut.getPlaceToStandInTheCircle(10, 3) must_== 4
    }
    "Where n == k" >> {
      CountingOut.getPlaceToStandInTheCircle(2, 2) must_== 1
      CountingOut.getPlaceToStandInTheCircle(3, 3) must_== 2
      CountingOut.getPlaceToStandInTheCircle(4, 4) must_== 2
      CountingOut.getPlaceToStandInTheCircle(5, 5) must_== 2
      CountingOut.getPlaceToStandInTheCircle(6, 6) must_== 4
      CountingOut.getPlaceToStandInTheCircle(7, 7) must_== 5
      CountingOut.getPlaceToStandInTheCircle(8, 8) must_== 4
      CountingOut.getPlaceToStandInTheCircle(9, 9) must_== 8
      CountingOut.getPlaceToStandInTheCircle(10, 10) must_== 8
    }
    "Where n is very large, and k =2" >> {
      CountingOut.getPlaceToStandInTheCircle(800, 2) must_== 577
      CountingOut.getPlaceToStandInTheCircle(900, 2) must_== 777
      CountingOut.getPlaceToStandInTheCircle(1000, 2) must_== 977
    }
  }
  //http://etorreborre.github.io/specs2/guide/SPECS2-3.8.3/org.specs2.guide.Structure.html
}