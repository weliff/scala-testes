import java.util.ArrayList


object Main {
  def main(args: Array[String]): Unit = {
    var s = println("Hello World!")
    soma(x => print(x), 5, 6)
    
    val c = new Conta("123", "1123", 123f);
    c.saldo = 2
    
    println(c.deposito(3f))
    println(c.saque(121))
    
    val lista = new ArrayList[String];
    
  }
  
  def soma(callbacks: Int => Unit, x: Int, y: Int) {
    callbacks(x)
  }
}