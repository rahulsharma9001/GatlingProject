package api

//import io.gatling.core.Predef.Simulation
import io.gatling.core.Predef._
import io.gatling.http.Predef._

class APIDemo extends Simulation{
  //Protocol
  val httpProtocol = http.baseUrl("https://reqres.in/api")

  //Scenario
  val scn = scenario("Get API Demo")
    .exec(
      http("Get User")
        .get("/users/2")
        .check(status.is(200))
        .check(jsonPath("").is(""))
    )

  //Setup
}
