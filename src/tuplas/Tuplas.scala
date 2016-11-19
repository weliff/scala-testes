package tuplas

object Tuplas extends App {
  
  val t1 = (1, "Weliff", 19.0)
  val t2 = (1, "Weliff", 19.0)
	val t3 = 10 -> "Weliff" -> 19.0 -> "AA" //MESMO EFEITO ACIMA 
  
  
  println(t3._2)
}