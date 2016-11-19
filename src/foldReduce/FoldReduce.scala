package foldReduce

object FoldReduce extends App {
  
  val numeros = List(1,2,3,4,5,6,7,8,9)
  
  val resultReduce = numeros.reduceLeft((acc, b) => acc + b)
  val resultFold = numeros.par.foldLeft(0)((acc, b) => acc + b) // fold deve receber o valor do elemento acumulador

  var acc = 1; // váriavel com estado compartilhado
  
  numeros.par.foreach { x => acc += acc/x} //problema da imutabilidade
  
  var acumu = numeros.par.foldLeft(10)((acc, ele) => acc+ele) //resolvendo o problema, o estado sempre será o mesmo
  
  println("acumulador compartilhado >>> " + acc)
  println("acumulador único >>> " + acumu)
  
  println(resultReduce)
  println("resultado do fold >> " + resultFold)
  
  
  def funcoes(f:Int => Int*) = {
    f.reduce((a, b) => a.andThen(b))
  }
  
}