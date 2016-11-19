package funcoesCurrying

object CurryingTeste {
  def main(args: Array[String]): Unit = {
    
    println(modN(2)_)  
    
    
    println(soma(modN(2)))
    sum(modN(1) _)
    
  }
  def modN(x: Int)(y: Int) = x + y
  
  def soma(f:(Int) => Int*) = {
      val result = f.reduce((a, b) => a.andThen(b))
		  var x = result(2)
		  
		  println(x == 2)
		  x
  }
  
  def testeFunc() = {
    (x:Int) => x
  }
  
  def sum(a: Int => Int) = a(2)
  
  sum(testeFunc())
  
  def +(e: Int, i: Int) = {
   
  }
  
  
  val ggh = (x: Int) => {x + 2}
  ggh(2)
}