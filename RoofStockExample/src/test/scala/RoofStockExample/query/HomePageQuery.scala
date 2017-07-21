package RoofStockExample.query

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object HomePageQuery {
  val homepageQuery = http("HomePage")
    .get("")
    .check(status.is(200))

}