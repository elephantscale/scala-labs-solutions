name := "vending-machine"

version := "1.0"

scalaVersion := "2.13.3"

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2-core" % "4.10.0" % "test"
)

// scalacOptions += "-feature"

scalacOptions in Test ++= Seq("-Yrangepos")