package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.Chrome;
import views.html.Firefox;
import views.html.Ie;
import views.html.Index;

/**
 * Provides controllers for this application.
 */
public class Application extends Controller {

  /**
   * Returns the home page.
   * @return The resulting home page.
   */
  public static Result Index() {
    return ok(Index.render("Welcome to the home page."));
  }
  /**
   * Returns the IE page.
   * @return The resulting IE page.
   */
  public static Result Ie() {
    return ok(Ie.render("Welcome to the Internet Explorer page."));
  }
  /**
   * Returns the Firefox page.
   * @return The resulting Firefox page.
   */
  public static Result Firefox() {
    return ok(Firefox.render("Welcome to the Firefox page ."));
  }
  /**
   * Returns the Chrome page.
   * @return The resulting Chrome page.
   */
  public static Result Chrome() {
    return ok(Chrome.render("Welcome to the Chrome page."));
  }
}
