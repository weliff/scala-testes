package implicits

import java.io.File


class Implicits {

  def imprime(implicit nome: String, idade:Int) = {
    println(nome + " " + idade)
  }
  
  1 to 10  // conversao de Int para RichInt que tem o método to(Int)

  /*
   * método implicit que converte a String no File 
   */
  implicit def stringToFile(nome:String) = {
    new File(nome)
  }
  
  val file:File = "File"
}


object Main extends App {
  implicit val nome = "Weliff"
  implicit val idade = 22
  implicit def string2Impli(value:String) = {
     new Implicits
  }
  val im =  new Implicits
  val im2:Implicits =  " "
  
  im.imprime
  
//  val file:File = "" 
}