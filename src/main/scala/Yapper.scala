object Yapper {

  val greeting:String="Hello my fellow memeros"
  val farewell:String="Farewell my tiny memeros"
  
  def main(args: Array[String]): Unit = {
    say(greeting)
    say(farewell)
  }

  def say(something:String):Unit={
    println(something)

  }
}