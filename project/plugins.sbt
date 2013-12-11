// Comment to get more information during initialization
logLevel := Level.Warn

// The Typesafe repository
resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

// Use the Play sbt plugin for Play projects
resolvers += Resolver.url("Typesafe Ivy Snapshots Repository", url("http://repo.typesafe.com/typesafe/ivy-snapshots"))(Resolver.ivyStylePatterns)

addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.3-SNAPSHOT")

// sbt-web plugins
resolvers ++= Seq(
    Resolver.url("sbt snapshot plugins", url("http://repo.scala-sbt.org/scalasbt/sbt-plugin-snapshots"))(Resolver.ivyStylePatterns),
    Resolver.sonatypeRepo("snapshots"),
    "Typesafe Snapshots Repository" at "http://repo.typesafe.com/typesafe/snapshots/",
    "Spray Releases" at "http://repo.spray.io/"
    )

addSbtPlugin("com.typesafe" % "sbt-jshint-plugin" % "1.0.0-SNAPSHOT")