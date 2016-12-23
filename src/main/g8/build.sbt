lazy val `$name;format="normalize"$` = project.in(file("."))
  .settings(
    name := "$name$",
    organization := "$organization$",
    scalaVersion := "$scala_version$",
    libraryDependencies += Dependencies.scalaTest
  )

