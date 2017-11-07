object Main {

  def main(args: Array[String]): Unit = {
    import com.softwaremill.sttp._
    implicit val backend = HttpURLConnectionBackend()
    val request = sttp.get(uri"http://www.google.com")
    val response = request.send()
  }
}
