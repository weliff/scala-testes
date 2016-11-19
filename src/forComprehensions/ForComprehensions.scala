package forComprehensions
/**
 * SAO MAPEADOS PARA METODOS DA COLECAO ITERADA
 */
object ForComprehensions extends App {
  
  //FUNCAO DE EFEITO COLATERAL
  for(i <- 1 to 10) println(i)

  //FUNCAO DE CONVERSÃO (MAP)
  val a = for(i <- 1 to 10) yield i.toDouble
  println(a)
  
  //FUNCAO DE CONVERSAO (MAP) E FILTER
  val filter = for(i <- 1 to 10 if i % 2 == 0) yield i.toDouble
  
  
}