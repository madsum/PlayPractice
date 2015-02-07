package controllers

import play.api.mvc._

// adding very imporant update
object Application extends Controller {

  def index = Action {
<<<<<<< HEAD
    Ok(views.html.index("This is from win conflicrt branch. Again do some update from win conflict"))
=======
    Ok(views.html.index("This is from win conflicrt branch. Again do some update from win conflict. This important update. Forgot las time. Ok Ok "))

>>>>>>> This is combaning again latest 2 commit
  }

}

// test 1

// test 2

// test 3

// test 4