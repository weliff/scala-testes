package exceptions

import scala.util.Failure
import scala.util.Success
import scala.util.Try

object Exceptions extends App {
  
  /*
   * TRATAMENTO COMUM
   */
  
  try {
//    throw new IllegalArgumentException
    1/0
  } catch {
    case t: IllegalArgumentException => t.printStackTrace()
    case t: ArithmeticException => println("Não pode dividir por zero")
    case _:Throwable => println("Qualquer exception")
  }
  
  def dividir(a:Int, b:Int) = {
    Try({a/b})
  }
  
  val resultado1 = dividir(10, 0)
  val resultado2 = dividir(10, 2)
  println(s"Resutado 1 >>> " + resultado1.map { x => x.toString() })
  println(s"Resutado 2 >>> " + resultado2.get)
  
  resultado2 foreach(i => println("Operação no elemento " + i + i))
  
  processResultado(resultado1)
  processResultado(resultado2)
  
  def processResultado(resultado:Try[Int]) = {
    resultado match {
      case Success(success)=> {println(s"Sucesso $success")} 
      case Failure(fail) => println(s"Falhou =>>> $fail") 
      case e:Try[Int] => println("Falhou") 
      case _ => println(s"Falhou") 
    }
  }
  
  try {
    val resultado = dividir(10, 0)
    resultado.get
  } catch {
    case t: IllegalArgumentException => t.printStackTrace()
    case t: ArithmeticException => println("Não pode dividir por zero 2")
    case _:Throwable => println("Qualquer exception 2")
  }
  
}