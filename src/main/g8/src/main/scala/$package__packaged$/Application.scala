package $package$

import fs2._
import org.http4s._
import org.http4s.dsl._
import org.http4s.server.blaze.BlazeBuilder
import org.http4s.util.StreamApp

object Application extends StreamApp {
  private[this] val logger = org.log4s.getLogger

  override def stream(args: List[String]): Stream[Task, Nothing] = {
    val port = args.headOption.map(_.toInt).getOrElse(8080)

    logger.info(s"Starting service on port \$port")

    BlazeBuilder
      .bindHttp(port, "0.0.0.0")
      .mountService(Service.routes)
      .serve
  }
}

object Service {
  def routes = HttpService {
    case GET -> Root =>
      Ok("Your webapp $name$ is ready!")
  }
}