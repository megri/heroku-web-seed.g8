lazy val `$name;format="normalize"$` = project.in(file("."))
  .enablePlugins(JavaAppPackaging)
  .settings(
    name := "$name$",
    organization := "$organization$",
    scalaVersion := "$scala_version$",
    libraryDependencies ++= Dependencies.circe(),
    libraryDependencies ++= Dependencies.http4s(),
    libraryDependencies ++= Dependencies.log4s(),
    libraryDependencies ++= Dependencies.logback(),
    libraryDependencies ++= Dependencies.scalaTest()
  )
