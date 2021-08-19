package x

import org.json4s._
import org.json4s.native.JsonMethods._
import scala.io.Source


// JSON Schema is as follows
// {"session": "session_36", "domain": "youtube.com", "cost": 118, "user": "user_9", "campaign": "campaign_19", 
//   "ip": "ip_4", "action": "clicked", "timestamp": 1420070400000}

case class Click(session: String, domain:String, cost: Int, user: String, campaign : String, ip : String, action : String, timestamp: Long)



object Clickstream extends App {
  implicit val formats = DefaultFormats

  val fileName = args(0)

  // TODO produce aggregates
  for (js <- Source.fromFile(fileName).getLines) {
    val click = parse(js).extract[Click]
    println(click)
  }
}
