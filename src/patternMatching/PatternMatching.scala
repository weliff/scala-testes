package patternMatching

object PatternMatching extends App{
  
  val idade = 19
  
  val maior = idade match {
    case x if x >= 18 => x.toDouble  //true
    case _ => false
  }
  
  println(maior)
  
  val dia = 30
  
  val fimDeMes = dia match {
    case 30 | 29 | 28 => true
  }
  
  println(fimDeMes)
  
  val teste:Any = "Teste"
  
  val testeTipo = teste match {
    case i:Int => println(s"$i é integer")
    case i:String => println(s"$i é String")
    case _ => println("é desconhecido")
  }
  
  
  //MÉTODOS APPLY E UNAPPLY
  
  class Aluno(val nome:String = "Weliff", val idade:Int)
  object Aluno{
    def apply(nome: String, idade: Int) =  new Aluno(nome, idade)
    def apply(idade: Int) =  new Aluno(idade = idade);
    def unapply(aluno: Aluno) : Option[(String, Int)] = Option(aluno.nome, aluno.idade)
  }
  
  
  val aluno = Aluno(idade = 2)
  aluno match {
    case anome Aluno aidade if aidade >= 18 => println(s"aluno maior de idade $aidade $anome") // Aluno(anome, aidade)
    case Aluno(_, idade) if idade >= 18 => println("extraindo somente a idade")
    case Aluno("Weliffs",_) => println("casando os valores de extracao")
    case a if a.nome == "" => println("outro aluno 1")
    case a:Aluno => println("outro aluno 2")
//    case _:Aluno => println("outro aluno 2")
  }
  
  //LIST MATCH
  
  def genStrDaLista(list1: List[_]): String = list1 match {
    case Nil => ""
    case head :: tail =>  println(head);  println(tail); head + " " + genStrDaLista(tail); // ::(head, tail)
  }
  
  val listaStr = genStrDaLista(List(1,2,3,4,5))
  println(listaStr)  
  
  val opt = Option(10)
  opt map(s => s.toByte)
  opt map(_.toByte)
  
  
}