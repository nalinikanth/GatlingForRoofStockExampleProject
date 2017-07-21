package RoofStockExample.simulations

import RoofStockExample.scenario._
import httpSetup._
import io.gatling.core.Predef._

class HomePageSimulation extends Simulation {
 val httpConf = HttpSetup.httpProtocol
  val scn = HomePageScenario.homepageScenario

  setUp(scn.inject(atOnceUsers(20))
    .protocols(httpConf)).assertions(forAll.failedRequests.count.is(0))
}