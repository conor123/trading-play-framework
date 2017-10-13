name := """example-app"""

version := "1.3-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs
)

enablePlugins(DebianPlugin)
maintainer := "Conor Ryan <office@conorryan.ie>"
packageSummary := "Trading app package"
packageDescription := "The packaged Trading App"
