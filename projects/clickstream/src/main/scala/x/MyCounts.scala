package x

import java.util.Date
import java.text.SimpleDateFormat

class MyCounts(var clicks: Seq[Click]) {
  def numClicksByDay(): Long = {
    0
  }

  def addDayFields()  {
    clicks = clicks.map(a => new Click(a.session, a.domain, a.cost, a.user, a.campaign, a.ip, a.action, a.timestamp, Some(convertTimeStamp(a.timestamp))))
  }

  def convertTimeStamp(ts: Long) :String = {
    val df:SimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd")
    df.format(ts)

  }


}
