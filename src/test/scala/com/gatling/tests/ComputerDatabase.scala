package com.gatling.tests

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class ComputerDatabase extends Simulation {

	//protocol
	val httpProtocol = http
		.baseUrl("https://computer-database.gatling.io")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""",
		""".*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*detectportal\.firefox\.com.*"""), WhiteList())
		.acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.9,hi;q=0.8")
		.doNotTrackHeader("1")
		.upgradeInsecureRequestsHeader("1")
		.userAgentHeader("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Safari/537.36")

	//scenario
	val scn = scenario("ComputerDatabase")
		.exec(http("request_0")
			.get("/computers/new"))
		.pause(36)
		.exec(http("request_1")
			.post("/computers")
			.formParam("name", "Super Computer")
			.formParam("introduced", "2010-02-03")
			.formParam("discontinued", "2025-02-05")
			.formParam("company", "3"))
		.pause(15)
		.exec(http("request_2")
			.get("/computers?f=Super+Computer"))

	//setup
	setUp(scn.inject(atOnceUsers(100))).protocols(httpProtocol)

}