import com.typesafe.config.ConfigFactory

object Main {
  def main(args: Array[String]) {
    val conf  = ConfigFactory.load()
    val a = conf.getInt("integ.config1.b.value")
    val b = 1
  }
}
