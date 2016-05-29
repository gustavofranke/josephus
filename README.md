Counting Out Problem
====================

##### Summary:
This is an sbt project that solves a *counting out problem*. Read [the Josephus problem](https://en.wikipedia.org/wiki/Josephus_problem) for a more detailed explanation.
Test specifications are expressed using [ the Specs2 framework](https://etorreborre.github.io/specs2/)

##### To run the project:
* `git clone <repo>`
* [install sbt](http://www.scala-sbt.org/0.13/docs/Setup.html)
* `sbt compile`
* `sbt "run <number of people in the circle> <step rate>"` (notice " characters location)
* You should see the program's output for your input values.
* *Optional:* you can run `sbt test` to run the test specs.