package RoofStockExample.simulations

import RoofStockExample.scenario._
import httpSetup._
import scala.concurrent.duration._
import io.gatling.core.Predef._


class IPMSimulation extends Simulation{
  val httpConf = HttpSetup.httpProtocol
  val scn = IPMGetScenario.getIPMScenario

  setUp(
    scn.inject(
      nothingFor(4 seconds), // 1
      atOnceUsers(3), // 2
      rampUsers(2) over(5 seconds), // 3
      constantUsersPerSec(5) during(15 seconds), // 4
      constantUsersPerSec(5) during(15 seconds) randomized, // 5
      rampUsersPerSec(1) to 2 during(5 seconds), // 6
      rampUsersPerSec(2) to 4 during(5 seconds) randomized, // 7
      splitUsers(5) into(rampUsers(1) over(5 seconds)) separatedBy(1 seconds), // 8
      splitUsers(5) into(rampUsers(1) over(5 seconds)) separatedBy atOnceUsers(1), // 9
      heavisideUsers(2) over(2 seconds) // 10
    ).protocols(httpConf)
  ).assertions(forAll.failedRequests.count.is(0))
}
