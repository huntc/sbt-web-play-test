import com.typesafe.sbt.web.WebPlugin.WebKeys
import com.typesafe.jshint.sbt.JSHintPlugin
import com.typesafe.jshint.sbt.JSHintPlugin.JshintKeys

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

sourceDirectory in WebKeys.Assets := (baseDirectory in Compile).value / "app"

WebKeys.jsFilter := new PatternFilter("[^_].*\\.js".r.pattern)

resourceDirectory in WebKeys.Assets := (baseDirectory in Compile).value / "public"

resourceManaged in WebKeys.Assets := (classDirectory in Compile).value / "public"

compile in Compile <<= (compile in Compile).dependsOn(JshintKeys.jshint)