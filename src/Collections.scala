

object Collections {
  
  def printList(printFunction: Int => Unit, list: List[Int]) {
    for(i <- list){
      printFunction(i);
    }
  }
  
  def main(args: Array[String]): Unit = {
    val idades = List(10, 17, 22, 20);
    
    printList(i => print(i), idades);
    println
    
    printList(i => print(i * 2), idades)
    println
    
    val idadesMaioresDeDez = idades.filter { x => x > 10 }
    
    printList(i => print(i), idadesMaioresDeDez)
    println
    
    val idadesMenoresDeDez = idades.filterNot { x => x > 10 }

    printList(i => print(i), idadesMenoresDeDez)
    
    
  }
  
}