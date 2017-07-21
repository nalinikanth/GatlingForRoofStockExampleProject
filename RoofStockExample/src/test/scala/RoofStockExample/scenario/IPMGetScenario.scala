package RoofStockExample.scenario

import io.gatling.core.Predef._
import RoofStockExample.query._

object IPMGetScenario {
  val getIPMScenario = scenario("IPM scenario")
    .exec(InvestmentPropertyMarketplaceQuery.getInvestmentPropertyMarketplace)
}
