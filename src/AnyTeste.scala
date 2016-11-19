

object AnyTeste {
  def main(args: Array[String]): Unit = {
    
    val list = List.newBuilder[Any]
    
    list +=("String")
    list += (123)
    
    println(list)
  }
}