package typebounds

import java.io.BufferedWriter
import java.io.ByteArrayOutputStream
import java.io.OutputStreamWriter

class TypeBounds {

  //define um type bound
  type Fechavel = { def close(): Unit }
  
  def processEFecha[A <: Fechavel](recurso: A)(f: A => Any) = {
    try {
      f(recurso)
      println(recurso)
    } finally {

    }
  }

  def lerArquivo() = {
    val output = new BufferedWriter(new OutputStreamWriter(new ByteArrayOutputStream()))
    val aaa = (e: BufferedWriter) => {
      e
    }
    
    val f = (b: BufferedWriter) =>   
    
    processEFecha(output)(aaa)
    processEFecha(output)(f)
    processEFecha(output)(_)
  }
  
}

object Main extends App {
  new TypeBounds().lerArquivo()
}