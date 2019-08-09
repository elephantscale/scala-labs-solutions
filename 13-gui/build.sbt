name := "mypopup"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2-core" % "3.8.2" % "test"
)

libraryDependencies += "org.scalafx" %% "scalafx" % "8.0.144-R12"

scalacOptions += "-feature"
