package com.gatling.tests
import io.gatling.core.Predef._

class Feeder extends Simulation{

  val feeder = csv("data/data.csv").random

  val sce = scenario("Feeders Demo")
    .feed(feeder)
    .exec { session =>
      println("Name: "+session("Name").as[String])
      println("Job: "+session("Job Role").as[String])
      session
    }

  setUp(sce.inject(atOnceUsers(1)))

}
