name := "josephus"

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2-core" % "3.8.3" % "test"
)

resolvers ++= Seq("snapshots", "releases").map(Resolver.sonatypeRepo)

scalacOptions in Test ++= Seq("-Yrangepos")

val n = System.getProperty("n")
val k = System.getProperty("k")