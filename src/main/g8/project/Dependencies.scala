import sbt._

object Dependencies {
  def circe(version: String = "0.8.0") = Seq(
    "io.circe" %% "circe-core" % version,
    "io.circe" %% "circe-literal" % version,
    "io.circe" %% "circe-generic" % version,
    "io.circe" %% "circe-parser" % version
  )

  def http4s(version: String = "0.17.0") = Seq(
    "org.http4s" %% "http4s-circe" % version,
    "org.http4s" %% "http4s-dsl" % version,
    "org.http4s" %% "http4s-blaze-server" % version,
    "org.http4s" %% "http4s-blaze-client" % version
  )

  def log4s(version: String = "1.3.5") = Seq(
    "org.log4s" %% "log4s" % version
  )

  def logback(version: String = "1.2.3") = Seq(
    "ch.qos.logback" % "logback-classic" % version
  )

  def scalaTest(version: String = "3.0.1") = Seq(
    "org.scalatest" %% "scalatest" % version % Test
  )
}
