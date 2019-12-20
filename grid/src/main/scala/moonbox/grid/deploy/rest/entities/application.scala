package moonbox.grid.deploy.rest.entities

import java.util.Date

case class ApplicationIn(
	appName: String,
	appType: String,
	config: Map[String, String],
	cluster: Option[String],
	org: String,
	worker: Option[String],
	startOnBoot: Boolean
)

case class ApplicationOut(
	org: String,
	appName: String,
	appType: String,
	config: Map[String, String],
	createTime: Option[Date],
	startTime: Option[Date],
	needReload: Option[Boolean],
	state: Option[String],
	worker: Option[String],
	startOnBoot: Boolean
)
