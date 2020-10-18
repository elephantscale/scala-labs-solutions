name := "vending-machine"

version := "1.0"

scalaVersion := "2.13.3"

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2-core" % "3.8.2" % "test"
)


scalacOptions += "-feature"