import sbt.Keys.libraryDependencies

lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  .settings(
    name := """play-scala-hello-world-tutorial""",
    organization := "com.example",
    version := "1.0-SNAPSHOT",
    scalaVersion := "2.13.8",
    libraryDependencies ++= Seq(
      guice,
      "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test
    ),



    scalacOptions ++= Seq(
      "-feature",
      "-deprecation",
      "-Xfatal-warnings"
    ),
      libraryDependencies += "org.mongodb.scala" %% "mongo-scala-driver" % "4.6.0",

    libraryDependencies += "org.json4s" %% "json4s-jackson" % "3.6.10",
libraryDependencies += "org.slf4j" % "slf4j-api" % "2.0.0"
  )

