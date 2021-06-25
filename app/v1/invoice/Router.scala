package v1.invoice

import javax.inject.Inject
import play.api.mvc._
import play.api.routing.Router.Routes
import play.api.routing._
import play.api.routing.sird._
import play.api.mvc.Action

class Router  @Inject()(controller: Controller) extends SimpleRouter {

/*  val router = Router.from {
    case GET(p"/items/$id<[0-9]+>") =>
      Action {
        Results.Ok(s"Item $id")
      }
  }*/

  override def routes: Routes = {

    case GET(p"/")  => controller.index1
    case GET(p"/${int(id) }") => controller.get(id)

  }
}
