class Conta(agencia: String, val numero: String, var saldo: Float) {
  println(agencia)
  println(numero)
  
  var n = numero
  var a = agencia;
  var s = saldo;
  
  
  def deposito(valor: Float) = {
    s += valor;
  }
  
  def saque(valor:Float): Boolean = {
    if (s - valor >= 0) {
      s -= valor;
      true
    }
    false
  }
  
  override def toString() =
    "(Agencia:" + a + ", Conta: " + n + ", Saldo: " + s + ")"
  
}

