package parametros

class URL {
  
  def connect(host: String = "", port: Int = 0) =
    println(s"$host - $port")
    
  
}
object Teste extends App{
 	new URL().connect("local", 8080)
  new URL().connect(host="remote")
}