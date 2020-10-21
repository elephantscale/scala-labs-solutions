package x

import org.json4s._
import org.json4s.native.JsonMethods._
import scala.io.Source
import org.joda.time.format.DateTimeFormat


// JSON Schema is as follows
// {"session": "session_36", "domain": "youtube.com", "cost": 118, "user": "user_9", "campaign": "campaign_19", 
//   "ip": "ip_4", "action": "clicked", "timestamp": 1420070400000}

case class Click(session: String, domain:String, cost: Int, user: String, campaign : String, ip : String, action : String, timestamp: Long, day: Option[String])

object Clickstream extends App {
  implicit val formats = DefaultFormats

  val fileName = "clickstream.json"

  val transactions = Source.fromFile(fileName).getLines.toSeq.map(parse(_).extract[Click])

  //clicks.foreach(println)

  val onlyclicks = transactions.filter(_.action == "clicked")
  val groupedClicks = onlyclicks.groupBy(a => DateTimeFormat.forPattern("YYYY-MM-dd").print(a.timestamp))
  val clickedCounts = groupedClicks.map(a => (a._1, a._2.size))

  println("Clicks By Day: " + clickedCounts)

  val blockedClicks = transactions.filter(_.action == "blocked")
  val groupedBlockedClicks = blockedClicks.groupBy(a => DateTimeFormat.forPattern("YYYY-MM-dd").print(a.timestamp))
  val blockedCounts = groupedBlockedClicks.map(a => (a._1, a._2.size))
  println("Blocked Clicks By Day: " + blockedCounts)


  val groupedDomainDayClicks = onlyclicks.groupBy(a => (DateTimeFormat.forPattern("YYYY-MM-dd").print(a.timestamp), a.domain))
  val domainDayCounts = groupedDomainDayClicks.map(a => (a._1, a._2.size))
  println("Counts by Domain and Day: " + domainDayCounts)


  val groupedUserDayClicks = onlyclicks.groupBy(a => (DateTimeFormat.forPattern("YYYY-MM-dd").print(a.timestamp), a.user))
  val userDayCounts = groupedUserDayClicks.map(a => (a._1, a._2.size))
  println("Counts by User and Day: " + userDayCounts)
}
