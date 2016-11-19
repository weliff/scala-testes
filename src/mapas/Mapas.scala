package mapas

object Mapas extends App {
  
  val estados = Map(
    "SP" -> "São Paulo" -> 2, // as strings se transformam em keys e o valor 2 será o valor da key
    "MG" -> "Minas Gerais",
    "RJ" -> "Rio de Janeiro",
    123 -> "Rio de Janeiro",
    ("CE", "Ceará") // FUNCIONA DA MESMA FORMA
  )
  
  
  estados.par foreach println // imprime as tuplas em parelelo
  
  val a = estados.map(tulple2 => tulple2._1) 
  println("Resultado do map >>>>" + a)
  
  println(estados.get("CE"))
  println(estados)
  
  estados.keys foreach println // retorna um Iterable com todas as chaves
  estados.keySet foreach println //retorna um Set com todas as chaves
  
  
}