package tailRecursion

object TailRecursion extends App {
  
  def fatorial(x:Int) = {
    def fatAcc(acc: Int, x: Int): Long = {
      if(x == 0) acc
      else fatAcc(acc * x, x - 1)
    }
    
    fatAcc(1, x)
  }
  def fatorial(acc: Int, x:Int): Long = {
		  if(x == 0) acc
		  else fatorial(acc * x, x - 1)
  }  
  
  def soma(init: Int, fim: Int) : Long = {
    def somaAcc(acc: Int, atual: Int) : Long = {
      if(atual > fim) acc
      else somaAcc(acc + atual, atual + 1)
    }
    somaAcc(0, init)
    
  }
  
  println(fatorial(20))
  
  println(fatorial(1, 3))
  
  println(soma(1, 100000000))
  
}