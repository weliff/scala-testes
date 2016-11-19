package contrutores

class Pessoa(val nome: String)

class Rock(nome: String) extends Pessoa(nome + "Ramone") {
  def idade() = 13
}

object Main extends App{
  val baterista = new Rock("Marky")
  baterista.idade
  println(baterista.nome)

}
