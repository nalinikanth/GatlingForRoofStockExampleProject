package RoofStockExample.scenario

import io.gatling.core.Predef._
import RoofStockExample.query._

object HomePageScenario {
  val homepageScenario = scenario("Roof stock HomePage Scenario")
    .exec(HomePageQuery.homepageQuery)
}