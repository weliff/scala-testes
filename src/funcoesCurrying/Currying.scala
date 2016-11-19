package funcoesCurrying

object Currying extends App {
   
  def opera(op:(Int, Int) => Int)(x: Int, y:Int) = {
    require(x >10)
    op(x, y) + x + y
  }
  
  /*
   * DEFINE PARA O COMPILADOR CRIAR UMA NOVA FUNCAO QUE IRÁ PASSAR A SEGUNDA LISTA DE PARAMETROS E EM SEGUIDA EXECUTAR A FUNCAO BASE
   */
//  val somar2 = opera(_ + _)(2, 2) 
  val somar = opera(_ + _) _ 
  def subtrair = opera(_ - _) _
  
  println(somar(11, 11))  
  println(subtrair(11, 11))
  println(opera(_ - _)_)
  
  /*
   * MESMO EFEITO QUE UMA FUNCAO QUE RETORNA OUTRA  
   */
  
  def operacao(op: (Int, Int) => Int) = {
    (x:Int, y:Int) => op(x, y) + x + y
  }
  
  def testeOp(x:Int, y:Int) = x + y
  
  val soma = operacao(_ + _)
  println("function in function >>" + operacao(operacao(soma))(20,2))
  
  def oper(x:Int, y:Int) = {
    (a:Int, b:Int) => x + y + a + b
  }
  
  operacao(oper(2,2))(2,2)
  
  
  def subtracao(op:(Int, Int) => Int) = op(20,20)

  subtracao(subtrair)
  println(somar(11, 11))  
  println(subtrair(11, 11))
  println(operacao(_ * _)(11, 11))
}