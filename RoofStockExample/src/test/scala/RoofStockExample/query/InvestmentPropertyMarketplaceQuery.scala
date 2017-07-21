package RoofStockExample.query

import io.gatling.core.Predef._
import io.gatling.http.Predef._


object InvestmentPropertyMarketplaceQuery {
  val getInvestmentPropertyMarketplace = http("Investment Property Market Palce")
    .get("/investment-property-marketplace")
    .check(status.is(200))

}
