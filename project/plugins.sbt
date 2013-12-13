// Comment to get more information during initialization
logLevel := Level.Warn

// sbt-web plugins
resolvers ++= Seq(
    Resolver.url("sbt snapshot plugins", url("http://repo.scala-sbt.org/scalasbt/sbt-plugin-snapshots"))(Resolver.ivyStylePatterns),
    Resolver.sonatypeRepo("snapshots"),
    "Typesafe Snapshots Repository" at "http://repo.typesafe.com/typesafe/snapshots/",
    "Spray Releases" at "http://repo.spray.io/"
    )

addSbtPlugin("com.typesafe" % "sbt-jshint-plugin" % "1.0.0-SNAPSHOT")

// The Typesafe repository
resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.3-20131213005945Z")
