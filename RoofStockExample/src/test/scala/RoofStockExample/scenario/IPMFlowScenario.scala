package RoofStockExample.scenario

import io.gatling.core.Predef._
import RoofStockExample.query._


object IPMFlowScenario {
  val investmentMArketPalceScenario = scenario("Get Home page and Go to IPM page")
    .exec(HomePageQuery.homepageQuery)
    .pause(5)
    .exec(InvestmentPropertyMarketplaceQuery.getInvestmentPropertyMarketplace)
}
