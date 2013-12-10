import com.typesafe.jshint.sbt.JSHintPlugin

name := "test-jshint"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws
)     

play.Project.playScalaSettings

JSHintPlugin.jshintSettings

