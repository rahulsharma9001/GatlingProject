package com.gatling.tests

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class RecordedSimulation extends Simulation {

	val httpProtocol = http
		.baseUrl("https://www.isro.gov.in")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*detectportal\.firefox\.com.*"""), WhiteList())
		.doNotTrackHeader("1")
		.userAgentHeader("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Safari/537.36")

	val headers_0 = Map(
		"accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7",
		"accept-encoding" -> "gzip, deflate, br, zstd",
		"accept-language" -> "en-US,en;q=0.9,hi;q=0.8",
		"priority" -> "u=0, i",
		"sec-ch-ua" -> """Google Chrome";v="131", "Chromium";v="131", "Not_A Brand";v="24""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Linux",
		"sec-fetch-dest" -> "document",
		"sec-fetch-mode" -> "navigate",
		"sec-fetch-site" -> "cross-site",
		"sec-fetch-user" -> "?1",
		"upgrade-insecure-requests" -> "1")

	val headers_1 = Map(
		"accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br, zstd",
		"accept-language" -> "en-US,en;q=0.9,hi;q=0.8",
		"priority" -> "u=2, i",
		"sec-ch-ua" -> """Google Chrome";v="131", "Chromium";v="131", "Not_A Brand";v="24""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Linux",
		"sec-fetch-dest" -> "image",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "same-origin")

	val headers_4 = Map(
		"accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br, zstd",
		"accept-language" -> "en-US,en;q=0.9,hi;q=0.8",
		"priority" -> "i",
		"sec-ch-ua" -> """Google Chrome";v="131", "Chromium";v="131", "Not_A Brand";v="24""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Linux",
		"sec-fetch-dest" -> "image",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "same-origin")

	val headers_41 = Map(
		"accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br, zstd",
		"accept-language" -> "en-US,en;q=0.9,hi;q=0.8",
		"priority" -> "u=1, i",
		"sec-ch-ua" -> """Google Chrome";v="131", "Chromium";v="131", "Not_A Brand";v="24""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Linux",
		"sec-fetch-dest" -> "image",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "same-origin")

	val headers_42 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br, zstd",
		"accept-language" -> "en-US,en;q=0.9,hi;q=0.8",
		"origin" -> "https://www.isro.gov.in",
		"priority" -> "u=0",
		"sec-ch-ua" -> """Google Chrome";v="131", "Chromium";v="131", "Not_A Brand";v="24""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Linux",
		"sec-fetch-dest" -> "font",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin")

	val headers_47 = Map(
		"accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7",
		"accept-encoding" -> "gzip, deflate, br, zstd",
		"accept-language" -> "en-US,en;q=0.9,hi;q=0.8",
		"priority" -> "u=0, i",
		"sec-ch-ua" -> """Google Chrome";v="131", "Chromium";v="131", "Not_A Brand";v="24""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Linux",
		"sec-fetch-dest" -> "document",
		"sec-fetch-mode" -> "navigate",
		"sec-fetch-site" -> "same-origin",
		"sec-fetch-user" -> "?1",
		"upgrade-insecure-requests" -> "1")

	val headers_56 = Map(
		"sec-ch-ua" -> """Google Chrome";v="131", "Chromium";v="131", "Not_A Brand";v="24""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Linux")



	val scn = scenario("RecordedSimulation")
		.exec(http("request_0")
			.get("/")
			.headers(headers_0)
			.resources(http("request_1")
			.get("/media_isro/image/BhuvanAndExpert/new/contact.jpg.webp")
			.headers(headers_1),
            http("request_2")
			.get("/media_isro/image/BhuvanAndExpert/new/askanexpert.png.webp")
			.headers(headers_1),
            http("request_3")
			.get("/media_isro/image/BhuvanAndExpert/new/feedback.jpg.webp")
			.headers(headers_1),
            http("request_4")
			.get("/media_isro/image/hormenu/igrasp.png.webp")
			.headers(headers_4),
            http("request_5")
			.get("/media_isro/image/hormenu/stem.png.webp")
			.headers(headers_4),
            http("request_6")
			.get("/media_isro/image/hormenu/spark.png.webp")
			.headers(headers_4),
            http("request_7")
			.get("/media_isro/image/hormenu/mosdac.jpg.webp")
			.headers(headers_4),
            http("request_8")
			.get("/media_isro/image/hormenu/issdc.png.webp")
			.headers(headers_4),
            http("request_9")
			.get("/media_isro/image/hormenu/bhoonidhi.png.webp")
			.headers(headers_4),
            http("request_10")
			.get("/media_isro/image/hormenu/bhuvan.png.webp")
			.headers(headers_4),
            http("request_11")
			.get("/media_isro/image/hormenu/vedas.png.webp")
			.headers(headers_4),
            http("request_12")
			.get("/media_isro/image/hormenu/isro1.png.webp")
			.headers(headers_4),
            http("request_13")
			.get("/media_isro/image/index/Recent/pslvc58xposat.jpg.webp")
			.headers(headers_4),
            http("request_14")
			.get("/media_isro/image/centreimages/bodies/PRL-new_small.jpg.webp")
			.headers(headers_4),
            http("request_15")
			.get("/media_isro/image/centreimages/bodies/narl_small.jpg.webp")
			.headers(headers_4),
            http("request_16")
			.get("/media_isro/image/centreimages/bodies/nesac_small.png.webp")
			.headers(headers_4),
            http("request_17")
			.get("/media_isro/image/centreimages/bodies/iist_small.png.webp")
			.headers(headers_4),
            http("request_18")
			.get("/media_isro/image/centreimages/isroHQs.jpg.webp")
			.headers(headers_4),
            http("request_19")
			.get("/media_isro/image/centreimages/VSSC.jpg.webp")
			.headers(headers_4),
            http("request_20")
			.get("/media_isro/image/centreimages/LPSC.jpg.webp")
			.headers(headers_4),
            http("request_21")
			.get("/media_isro/image/centreimages/SHAR.jpg.webp")
			.headers(headers_4),
            http("request_22")
			.get("/media_isro/image/centreimages/ursc.jpg.webp")
			.headers(headers_4),
            http("request_23")
			.get("/media_isro/image/centreimages/sac.jpg.webp")
			.headers(headers_4),
            http("request_24")
			.get("/media_isro/image/centreimages/nrsc.jpg.webp")
			.headers(headers_4),
            http("request_25")
			.get("/media_isro/image/centreimages/HSFC.png.webp")
			.headers(headers_4),
            http("request_26")
			.get("/media_isro/image/centreimages/IPRC.jpg.webp")
			.headers(headers_4),
            http("request_27")
			.get("/media_isro/image/centreimages/IISU.jpg.webp")
			.headers(headers_4),
            http("request_28")
			.get("/media_isro/image/centreimages/istrac.jpg.webp")
			.headers(headers_4),
            http("request_29")
			.get("/media_isro/image/centreimages/MCF.png.webp")
			.headers(headers_4),
            http("request_30")
			.get("/media_isro/image/centreimages/IIRS.png.webp")
			.headers(headers_4),
            http("request_31")
			.get("/media_isro/image/centreimages/bodies/inspace_large.jpg.webp")
			.headers(headers_4),
            http("request_32")
			.get("/media_isro/image/centreimages/bodies/NSIL_large.jpg.webp")
			.headers(headers_4),
            http("request_33")
			.get("/media_isro/image/menu/menu_2.jpg.webp")
			.headers(headers_4),
            http("request_34")
			.get("/media_isro/image/centreimages/LEOS.png.webp")
			.headers(headers_4),
            http("request_35")
			.get("/media_isro/image/menu/menu_1.jpg.webp")
			.headers(headers_4),
            http("request_36")
			.get("/media_isro/image/menu/menu_set.jpg.webp")
			.headers(headers_4),
            http("request_37")
			.get("/media_isro/image/menu/menu_img.jpg.webp")
			.headers(headers_4),
            http("request_38")
			.get("/media_isro/image/menu/menu_new.jpg.webp")
			.headers(headers_4),
            http("request_39")
			.get("/media_isro/image/search-white.svg")
			.headers(headers_4),
            http("request_40")
			.get("/media_isro/image/menu/menu_edit.jpg.webp")
			.headers(headers_4),
            http("request_41")
			.get("/media_isro/image/accer.png.webp")
			.headers(headers_41),
            http("request_42")
			.get("/assets/fonts/bootstrap-icons.woff2?a74547b2f0863226942ff8ded57db345")
			.headers(headers_42),
            http("request_43")
			.get("/media_isro/image/indiagov_logo.jpg.webp")
			.headers(headers_4),
            http("request_44")
			.get("/media_isro/image/india_code_logo.jpg.webp")
			.headers(headers_4),
            http("request_45")
			.get("/media_isro/image/STQC.jpg.webp")
			.headers(headers_4),
            http("request_46")
			.get("/media_isro/image/favicon.png.webp")
			.headers(headers_41)))
		.pause(2)
		.exec(http("request_47")
			.get("/academia.html")
			.headers(headers_47)
			.resources(http("request_48")
			.get("/media_isro/image/academia/resized/academia_large.png.webp")
			.headers(headers_1),
            http("request_49")
			.get("/media_isro/image/search-white.svg")
			.headers(headers_4),
            http("request_50")
			.get("/media_isro/image/accer.png.webp")
			.headers(headers_4),
            http("request_51")
			.get("/media_isro/image/indiagov_logo.jpg.webp")
			.headers(headers_4),
            http("request_52")
			.get("/media_isro/image/india_code_logo.jpg.webp")
			.headers(headers_4),
            http("request_53")
			.get("/media_isro/image/STQC.jpg.webp")
			.headers(headers_4),
            http("request_54")
			.get("/assets/fonts/bootstrap-icons.woff2?a74547b2f0863226942ff8ded57db345")
			.headers(headers_42)))
		.pause(5)
		.exec(http("request_55")
			.get("/SponsoredResearch.html")
			.headers(headers_47)
			.resources(http("request_56")
			.get("/media_isro/image/ISRO_R_D_Eco_System_Magazine_Ad.jpg.webp")
			.headers(headers_56),
            http("request_57")
			.get("/media_isro/image/search-white.svg")
			.headers(headers_4),
            http("request_58")
			.get("/media_isro/image/accer.png.webp")
			.headers(headers_4),
            http("request_59")
			.get("/media_isro/image/indiagov_logo.jpg.webp")
			.headers(headers_4),
            http("request_60")
			.get("/media_isro/image/STQC.jpg.webp")
			.headers(headers_4),
            http("request_61")
			.get("/media_isro/image/india_code_logo.jpg.webp")
			.headers(headers_4),
            http("request_62")
			.get("/assets/fonts/bootstrap-icons.woff2?a74547b2f0863226942ff8ded57db345")
			.headers(headers_42)))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}