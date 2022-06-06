name := "clickstream"

version := "1.0"

scalaVersion := "2.13.8"

libraryDependencies += "org.json4s" %% "json4s-native" % "3.7.0-M6"
libraryDependencies += "org.specs2" %% "specs2-core" % "4.10.0" % "test"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.0" % "test"
libraryDependencies += "joda-time" % "joda-time" % "2.10.6"

scalacOptions in Test ++= Seq("-Yrangepos")


