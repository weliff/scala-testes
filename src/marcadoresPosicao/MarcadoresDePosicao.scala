package marcadoresPosicao

object MarcadoresDePosicao extends App{
  
//  calculo((x:Int, y :Int) => 2 + 2 + y)
  calculo{_ + _}
  calculo({_ + _})
  
  def calculo(func:(Int, Int) => Int) = {
    func(2, 2)
  }
  
  
}