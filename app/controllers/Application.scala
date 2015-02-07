package controllers

import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("This is from win conflicrt branch. Again do some update from win conflict"))
  }

}