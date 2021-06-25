package v1.invoice

import play.api.Logger
import play.api.libs.json.Json
import play.api.mvc.{Action, AnyContent, BaseController, ControllerComponents, Handler, Result}

import javax.inject.Inject
import scala.concurrent.{ExecutionContext, Future}

// https://developer.lightbend.com/guides/play-rest-api/part-1/index.html
class Controller @Inject()(val controllerComponents: ControllerComponents) extends  BaseController {
  def get(id: Int): Handler = {
    Action { implicit request =>
      val r: Result = Ok(s"get ${id}")
      r
    }

  }


  private val logger = Logger(getClass)

  /*def index: Action[AnyContent] = PostAction.async { implicit request =>
    logger.trace("index: ")
    postResourceHandler.find.map { posts =>
      Ok(Json.toJson(posts))
    }
  }*/

  def index1: Action[AnyContent] =v


  def asyncIndex: Action[AnyContent] = Action.async { implicit request =>
    val r: Future[Result] = Future.successful(Ok("hello world"))
    r
  }

}
