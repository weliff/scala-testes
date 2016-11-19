package tiposEstruturais

import java.io._

class TiposEstruturais {
  def processEFecha[A <: {def close(): Unit}](recurso: A)(f: A => Any) = {
    try {
      f(recurso)
    }finally {
      
    }
  }
  
  def lerArquivo() = {
    val output = new BufferedWriter(new OutputStreamWriter(new ByteArrayOutputStream()))
    processEFecha(output)(_)
  }
  
}

