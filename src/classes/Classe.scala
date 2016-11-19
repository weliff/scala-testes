package classes

import java.io.IOException

case class Pessoa (var nome: String, val idade: Int) {
	private var _sobrenome = "LIMA"

	def this(nome: String, sobrenome: String, idade: Int) = {
    this(nome + " " + sobrenome, idade)
  }
  
  def sobrenome_=(sobrenome: String) = {
    if (nome.length() < 10) {
    	_sobrenome = sobrenome;
    }
    _sobrenome
  }
  
  def sobrenome = Option(_sobrenome)
  
  def buscarPorNome(nome: String) = {
    nome
  }
  
}

object Teste extends App {
  val p = Pessoa("Weliff", 22)
  p.nome = "Weliff Lima" 
  p.sobrenome = "123"
  println(p.toString())
  println(p.sobrenome.getOrElse({"Default"}))
  println(p.sobrenome)
}