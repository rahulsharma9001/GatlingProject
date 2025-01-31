package com.gatling.tests

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.language.postfixOps

class ISROWebPageSimulation extends Simulation {

	val httpProtocol = http.baseUrl("https://www.isro.gov.in")
//		.acceptHeader("application/json").header("Content-Type","application/json")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*detectportal\.firefox\.com.*"""), WhiteList())
		.doNotTrackHeader("1")
		.userAgentHeader("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Safari/537.36")

	val headers_0 = Map(
		"accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7",
		"accept-encoding" -> "gzip, deflate, br, zstd",
		"accept-language" -> "en-US,en;q=0.9,hi;q=0.8",
		"cache-control" -> "max-age=0",
		"if-modified-since" -> "Fri, 06 Dec 2024 04:54:23 GMT",
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
		"if-modified-since" -> "Wed, 21 Dec 2022 05:35:26 GMT",
		"priority" -> "u=2, i",
		"sec-ch-ua" -> """Google Chrome";v="131", "Chromium";v="131", "Not_A Brand";v="24""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Linux",
		"sec-fetch-dest" -> "image",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "same-origin")

	val headers_2 = Map(
		"accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br, zstd",
		"accept-language" -> "en-US,en;q=0.9,hi;q=0.8",
		"if-modified-since" -> "Thu, 06 Oct 2022 20:05:07 GMT",
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
		"if-modified-since" -> "Tue, 13 Dec 2022 09:10:10 GMT",
		"priority" -> "i",
		"sec-ch-ua" -> """Google Chrome";v="131", "Chromium";v="131", "Not_A Brand";v="24""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Linux",
		"sec-fetch-dest" -> "image",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "same-origin")

	val headers_5 = Map(
		"accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br, zstd",
		"accept-language" -> "en-US,en;q=0.9,hi;q=0.8",
		"if-modified-since" -> "Tue, 13 Dec 2022 09:10:11 GMT",
		"priority" -> "i",
		"sec-ch-ua" -> """Google Chrome";v="131", "Chromium";v="131", "Not_A Brand";v="24""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Linux",
		"sec-fetch-dest" -> "image",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "same-origin")

	val headers_13 = Map(
		"accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br, zstd",
		"accept-language" -> "en-US,en;q=0.9,hi;q=0.8",
		"if-modified-since" -> "Mon, 01 Jan 2024 07:39:55 GMT",
		"priority" -> "i",
		"sec-ch-ua" -> """Google Chrome";v="131", "Chromium";v="131", "Not_A Brand";v="24""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Linux",
		"sec-fetch-dest" -> "image",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "same-origin")

	val headers_14 = Map(
		"accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br, zstd",
		"accept-language" -> "en-US,en;q=0.9,hi;q=0.8",
		"if-modified-since" -> "Sun, 12 Jun 2022 08:18:18 GMT",
		"priority" -> "i",
		"sec-ch-ua" -> """Google Chrome";v="131", "Chromium";v="131", "Not_A Brand";v="24""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Linux",
		"sec-fetch-dest" -> "image",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "same-origin")

	val headers_15 = Map(
		"accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br, zstd",
		"accept-language" -> "en-US,en;q=0.9,hi;q=0.8",
		"if-modified-since" -> "Sun, 12 Jun 2022 08:18:17 GMT",
		"priority" -> "i",
		"sec-ch-ua" -> """Google Chrome";v="131", "Chromium";v="131", "Not_A Brand";v="24""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Linux",
		"sec-fetch-dest" -> "image",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "same-origin")

	val headers_16 = Map(
		"accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br, zstd",
		"accept-language" -> "en-US,en;q=0.9,hi;q=0.8",
		"if-modified-since" -> "Tue, 21 Jun 2022 05:06:21 GMT",
		"priority" -> "i",
		"sec-ch-ua" -> """Google Chrome";v="131", "Chromium";v="131", "Not_A Brand";v="24""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Linux",
		"sec-fetch-dest" -> "image",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "same-origin")

	val headers_17 = Map(
		"accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br, zstd",
		"accept-language" -> "en-US,en;q=0.9,hi;q=0.8",
		"if-modified-since" -> "Tue, 21 Jun 2022 05:06:20 GMT",
		"priority" -> "i",
		"sec-ch-ua" -> """Google Chrome";v="131", "Chromium";v="131", "Not_A Brand";v="24""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Linux",
		"sec-fetch-dest" -> "image",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "same-origin")

	val headers_18 = Map(
		"accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br, zstd",
		"accept-language" -> "en-US,en;q=0.9,hi;q=0.8",
		"if-modified-since" -> "Sun, 12 Jun 2022 08:18:14 GMT",
		"priority" -> "i",
		"sec-ch-ua" -> """Google Chrome";v="131", "Chromium";v="131", "Not_A Brand";v="24""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Linux",
		"sec-fetch-dest" -> "image",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "same-origin")

	val headers_19 = Map(
		"accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br, zstd",
		"accept-language" -> "en-US,en;q=0.9,hi;q=0.8",
		"if-modified-since" -> "Sun, 12 Jun 2022 08:18:20 GMT",
		"priority" -> "i",
		"sec-ch-ua" -> """Google Chrome";v="131", "Chromium";v="131", "Not_A Brand";v="24""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Linux",
		"sec-fetch-dest" -> "image",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "same-origin")

	val headers_20 = Map(
		"accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br, zstd",
		"accept-language" -> "en-US,en;q=0.9,hi;q=0.8",
		"if-modified-since" -> "Wed, 29 Jun 2022 09:14:07 GMT",
		"priority" -> "i",
		"sec-ch-ua" -> """Google Chrome";v="131", "Chromium";v="131", "Not_A Brand";v="24""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Linux",
		"sec-fetch-dest" -> "image",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "same-origin")

	val headers_23 = Map(
		"accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br, zstd",
		"accept-language" -> "en-US,en;q=0.9,hi;q=0.8",
		"if-modified-since" -> "Sun, 12 Jun 2022 08:18:19 GMT",
		"priority" -> "i",
		"sec-ch-ua" -> """Google Chrome";v="131", "Chromium";v="131", "Not_A Brand";v="24""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Linux",
		"sec-fetch-dest" -> "image",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "same-origin")

	val headers_25 = Map(
		"accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br, zstd",
		"accept-language" -> "en-US,en;q=0.9,hi;q=0.8",
		"if-modified-since" -> "Fri, 08 Jul 2022 07:11:17 GMT",
		"priority" -> "i",
		"sec-ch-ua" -> """Google Chrome";v="131", "Chromium";v="131", "Not_A Brand";v="24""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Linux",
		"sec-fetch-dest" -> "image",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "same-origin")

	val headers_27 = Map(
		"accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br, zstd",
		"accept-language" -> "en-US,en;q=0.9,hi;q=0.8",
		"if-modified-since" -> "Fri, 17 Jun 2022 10:04:28 GMT",
		"priority" -> "i",
		"sec-ch-ua" -> """Google Chrome";v="131", "Chromium";v="131", "Not_A Brand";v="24""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Linux",
		"sec-fetch-dest" -> "image",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "same-origin")

	val headers_31 = Map(
		"accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br, zstd",
		"accept-language" -> "en-US,en;q=0.9,hi;q=0.8",
		"if-modified-since" -> "Thu, 23 Jun 2022 06:09:31 GMT",
		"priority" -> "i",
		"sec-ch-ua" -> """Google Chrome";v="131", "Chromium";v="131", "Not_A Brand";v="24""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Linux",
		"sec-fetch-dest" -> "image",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "same-origin")

	val headers_32 = Map(
		"accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br, zstd",
		"accept-language" -> "en-US,en;q=0.9,hi;q=0.8",
		"if-modified-since" -> "Thu, 23 Jun 2022 06:09:32 GMT",
		"priority" -> "i",
		"sec-ch-ua" -> """Google Chrome";v="131", "Chromium";v="131", "Not_A Brand";v="24""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Linux",
		"sec-fetch-dest" -> "image",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "same-origin")

	val headers_33 = Map(
		"accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br, zstd",
		"accept-language" -> "en-US,en;q=0.9,hi;q=0.8",
		"if-modified-since" -> "Sun, 12 Jun 2022 08:40:34 GMT",
		"priority" -> "i",
		"sec-ch-ua" -> """Google Chrome";v="131", "Chromium";v="131", "Not_A Brand";v="24""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Linux",
		"sec-fetch-dest" -> "image",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "same-origin")

	val headers_35 = Map(
		"accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br, zstd",
		"accept-language" -> "en-US,en;q=0.9,hi;q=0.8",
		"if-modified-since" -> "Sun, 12 Jun 2022 08:40:33 GMT",
		"priority" -> "i",
		"sec-ch-ua" -> """Google Chrome";v="131", "Chromium";v="131", "Not_A Brand";v="24""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Linux",
		"sec-fetch-dest" -> "image",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "same-origin")

	val headers_39 = Map(
		"accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br, zstd",
		"accept-language" -> "en-US,en;q=0.9,hi;q=0.8",
		"if-modified-since" -> "Mon, 17 Apr 2023 06:22:20 GMT",
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
		"if-modified-since" -> "Sun, 12 Jun 2022 08:12:23 GMT",
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
		"if-modified-since" -> "Fri, 01 Jul 2022 05:13:52 GMT",
		"origin" -> "https://www.isro.gov.in",
		"priority" -> "u=0",
		"sec-ch-ua" -> """Google Chrome";v="131", "Chromium";v="131", "Not_A Brand";v="24""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Linux",
		"sec-fetch-dest" -> "font",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin")

	val headers_43 = Map(
		"accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br, zstd",
		"accept-language" -> "en-US,en;q=0.9,hi;q=0.8",
		"if-modified-since" -> "Sun, 12 Jun 2022 08:18:51 GMT",
		"priority" -> "i",
		"sec-ch-ua" -> """Google Chrome";v="131", "Chromium";v="131", "Not_A Brand";v="24""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Linux",
		"sec-fetch-dest" -> "image",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "same-origin")

	val headers_45 = Map(
		"accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br, zstd",
		"accept-language" -> "en-US,en;q=0.9,hi;q=0.8",
		"if-modified-since" -> "Fri, 19 May 2023 07:59:01 GMT",
		"priority" -> "i",
		"sec-ch-ua" -> """Google Chrome";v="131", "Chromium";v="131", "Not_A Brand";v="24""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Linux",
		"sec-fetch-dest" -> "image",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "same-origin")

	val headers_46 = Map(
		"accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br, zstd",
		"accept-language" -> "en-US,en;q=0.9,hi;q=0.8",
		"if-modified-since" -> "Wed, 27 Jul 2022 10:05:57 GMT",
		"priority" -> "u=1, i",
		"sec-ch-ua" -> """Google Chrome";v="131", "Chromium";v="131", "Not_A Brand";v="24""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Linux",
		"sec-fetch-dest" -> "image",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "same-origin")

	val headers_47 = Map(
		"accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7",
		"accept-encoding" -> "gzip, deflate, br, zstd",
		"accept-language" -> "en-US,en;q=0.9,hi;q=0.8",
		"if-modified-since" -> "Fri, 22 Sep 2023 11:39:59 GMT",
		"priority" -> "u=0, i",
		"sec-ch-ua" -> """Google Chrome";v="131", "Chromium";v="131", "Not_A Brand";v="24""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Linux",
		"sec-fetch-dest" -> "document",
		"sec-fetch-mode" -> "navigate",
		"sec-fetch-site" -> "same-origin",
		"sec-fetch-user" -> "?1",
		"upgrade-insecure-requests" -> "1")

	val headers_48 = Map(
		"accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br, zstd",
		"accept-language" -> "en-US,en;q=0.9,hi;q=0.8",
		"if-modified-since" -> "Fri, 05 Aug 2022 10:17:12 GMT",
		"priority" -> "u=2, i",
		"sec-ch-ua" -> """Google Chrome";v="131", "Chromium";v="131", "Not_A Brand";v="24""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Linux",
		"sec-fetch-dest" -> "image",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "same-origin")

	val headers_50 = Map(
		"accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br, zstd",
		"accept-language" -> "en-US,en;q=0.9,hi;q=0.8",
		"if-modified-since" -> "Sun, 12 Jun 2022 08:12:23 GMT",
		"priority" -> "i",
		"sec-ch-ua" -> """Google Chrome";v="131", "Chromium";v="131", "Not_A Brand";v="24""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Linux",
		"sec-fetch-dest" -> "image",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "same-origin")

	val headers_55 = Map(
		"accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7",
		"accept-encoding" -> "gzip, deflate, br, zstd",
		"accept-language" -> "en-US,en;q=0.9,hi;q=0.8",
		"if-modified-since" -> "Tue, 26 Dec 2023 06:13:02 GMT",
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



	val scn = scenario("ISROWebPageSimulation")
		.exec(http("request_0")
			.get("/")
			.headers(headers_0)
			.resources(http("request_1")
			.get("/media_isro/image/BhuvanAndExpert/new/contact.jpg.webp")
			.headers(headers_1),
            http("request_2")
			.get("/media_isro/image/BhuvanAndExpert/new/askanexpert.png.webp")
			.headers(headers_2),
            http("request_3")
			.get("/media_isro/image/BhuvanAndExpert/new/feedback.jpg.webp")
			.headers(headers_1),
            http("request_4")
			.get("/media_isro/image/hormenu/igrasp.png.webp")
			.headers(headers_4),
            http("request_5")
			.get("/media_isro/image/hormenu/stem.png.webp")
			.headers(headers_5),
            http("request_6")
			.get("/media_isro/image/hormenu/spark.png.webp")
			.headers(headers_5),
            http("request_7")
			.get("/media_isro/image/hormenu/mosdac.jpg.webp")
			.headers(headers_5),
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
			.headers(headers_5),
            http("request_12")
			.get("/media_isro/image/hormenu/isro1.png.webp")
			.headers(headers_4),
            http("request_13")
			.get("/media_isro/image/index/Recent/pslvc58xposat.jpg.webp")
			.headers(headers_13),
            http("request_14")
			.get("/media_isro/image/centreimages/bodies/PRL-new_small.jpg.webp")
			.headers(headers_14),
            http("request_15")
			.get("/media_isro/image/centreimages/bodies/narl_small.jpg.webp")
			.headers(headers_15),
            http("request_16")
			.get("/media_isro/image/centreimages/bodies/nesac_small.png.webp")
			.headers(headers_16),
            http("request_17")
			.get("/media_isro/image/centreimages/bodies/iist_small.png.webp")
			.headers(headers_17),
            http("request_18")
			.get("/media_isro/image/centreimages/isroHQs.jpg.webp")
			.headers(headers_18),
            http("request_19")
			.get("/media_isro/image/centreimages/VSSC.jpg.webp")
			.headers(headers_19),
            http("request_20")
			.get("/media_isro/image/centreimages/LPSC.jpg.webp")
			.headers(headers_20),
            http("request_21")
			.get("/media_isro/image/centreimages/SHAR.jpg.webp")
			.headers(headers_19),
            http("request_22")
			.get("/media_isro/image/centreimages/ursc.jpg.webp")
			.headers(headers_19),
            http("request_23")
			.get("/media_isro/image/centreimages/sac.jpg.webp")
			.headers(headers_23),
            http("request_24")
			.get("/media_isro/image/centreimages/nrsc.jpg.webp")
			.headers(headers_23),
            http("request_25")
			.get("/media_isro/image/centreimages/HSFC.png.webp")
			.headers(headers_25),
            http("request_26")
			.get("/media_isro/image/centreimages/IPRC.jpg.webp")
			.headers(headers_18),
            http("request_27")
			.get("/media_isro/image/centreimages/IISU.jpg.webp")
			.headers(headers_27),
            http("request_28")
			.get("/media_isro/image/centreimages/istrac.jpg.webp")
			.headers(headers_18),
            http("request_29")
			.get("/media_isro/image/centreimages/MCF.png.webp")
			.headers(headers_25),
            http("request_30")
			.get("/media_isro/image/centreimages/IIRS.png.webp")
			.headers(headers_25),
            http("request_31")
			.get("/media_isro/image/centreimages/bodies/inspace_large.jpg.webp")
			.headers(headers_31),
            http("request_32")
			.get("/media_isro/image/centreimages/bodies/NSIL_large.jpg.webp")
			.headers(headers_32),
            http("request_33")
			.get("/media_isro/image/menu/menu_2.jpg.webp")
			.headers(headers_33),
            http("request_34")
			.get("/media_isro/image/centreimages/LEOS.png.webp")
			.headers(headers_25),
            http("request_35")
			.get("/media_isro/image/menu/menu_1.jpg.webp")
			.headers(headers_35),
            http("request_36")
			.get("/media_isro/image/menu/menu_set.jpg.webp")
			.headers(headers_35),
            http("request_37")
			.get("/media_isro/image/menu/menu_img.jpg.webp")
			.headers(headers_35),
            http("request_38")
			.get("/media_isro/image/menu/menu_new.jpg.webp")
			.headers(headers_33),
            http("request_39")
			.get("/media_isro/image/search-white.svg")
			.headers(headers_39),
            http("request_40")
			.get("/media_isro/image/menu/menu_edit.jpg.webp")
			.headers(headers_33),
            http("request_41")
			.get("/media_isro/image/accer.png.webp")
			.headers(headers_41),
            http("request_42")
			.get("/assets/fonts/bootstrap-icons.woff2?a74547b2f0863226942ff8ded57db345")
			.headers(headers_42),
            http("request_43")
			.get("/media_isro/image/indiagov_logo.jpg.webp")
			.headers(headers_43),
            http("request_44")
			.get("/media_isro/image/india_code_logo.jpg.webp")
			.headers(headers_43),
            http("request_45")
			.get("/media_isro/image/STQC.jpg.webp")
			.headers(headers_45),
            http("request_46")
			.get("/media_isro/image/favicon.png.webp")
			.headers(headers_46)))
		.pause(2)
		.exec(http("request_47")
			.get("/academia.html")
			.headers(headers_47)
			.resources(http("request_48")
			.get("/media_isro/image/academia/resized/academia_large.png.webp")
			.headers(headers_48),
            http("request_49")
			.get("/media_isro/image/search-white.svg")
			.headers(headers_39),
            http("request_50")
			.get("/media_isro/image/accer.png.webp")
			.headers(headers_50),
            http("request_51")
			.get("/media_isro/image/indiagov_logo.jpg.webp")
			.headers(headers_43),
            http("request_52")
			.get("/media_isro/image/india_code_logo.jpg.webp")
			.headers(headers_43),
            http("request_53")
			.get("/media_isro/image/STQC.jpg.webp")
			.headers(headers_45),
            http("request_54")
			.get("/assets/fonts/bootstrap-icons.woff2?a74547b2f0863226942ff8ded57db345")
			.headers(headers_42)))
		.pause(5)
		.exec(http("request_55")
			.get("/SponsoredResearch.html")
			.headers(headers_55)
			.resources(http("request_56")
			.get("/media_isro/image/ISRO_R_D_Eco_System_Magazine_Ad.jpg.webp")
			.headers(headers_56),
            http("request_57")
			.get("/media_isro/image/search-white.svg")
			.headers(headers_39),
            http("request_58")
			.get("/media_isro/image/accer.png.webp")
			.headers(headers_50),
            http("request_59")
			.get("/media_isro/image/indiagov_logo.jpg.webp")
			.headers(headers_43),
            http("request_60")
			.get("/media_isro/image/STQC.jpg.webp")
			.headers(headers_45),
            http("request_61")
			.get("/media_isro/image/india_code_logo.jpg.webp")
			.headers(headers_43),
            http("request_62")
			.get("/assets/fonts/bootstrap-icons.woff2?a74547b2f0863226942ff8ded57db345")
			.headers(headers_42)))

	setUp(
		scn.inject(
			nothingFor(5), // Waiting for 5 Seconds before Starting
			atOnceUsers(10), // 1 User at Once
			rampUsers(10).during(5), // Gradual ramp-up of 10 users in 5 Seconds
		).protocols(httpProtocol))
}