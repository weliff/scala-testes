package validacoes

object Validacoes extends App {
  
  def metodo(a:Int): Int = {
    require(a > 10) // valida parametros
    a
  }
  
//  metodo(5)
  
  assume(metodo(11) > 15) //valida retornos 
  
  
}