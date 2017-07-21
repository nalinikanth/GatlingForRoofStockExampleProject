package httpSetup

import io.gatling.http.Predef._

object HttpSetup {
  val httpProtocol = http
    .baseURL("https://www.roofstock.com/")
}