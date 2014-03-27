import play.PlayScala
import PlayKeys._

lazy val root = project.in(file(".")).addPlugins(PlayScala)

name := "test-jshint"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws
)     

//engineType := EngineType.Node
