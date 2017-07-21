package RoofStockExample.simulations

import RoofStockExample.scenario._
import httpSetup._
import io.gatling.core.Predef._


class InvestmentPropertyMarketPlaceSimulation extends Simulation{
  val httpConf = HttpSetup.httpProtocol
  val scn = IPMFlowScenario.investmentMArketPalceScenario

  setUp(scn.inject(atOnceUsers(20))
    .protocols(httpConf)).assertions(forAll.failedRequests.count.is(0))
}
