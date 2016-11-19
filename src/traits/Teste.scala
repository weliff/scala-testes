package traits

trait Logging {
	
  def log(msg: String) : Unit = writeLog(format(msg))
  
	protected def writeLog(msg: String) : Unit
  def format(msg: String): String
}

trait SimpleFormatLogger extends Logging {
	def format(msg: String): String =  s"[log] $msg"
}

trait ComplexFormat extends Logging{
  def format(msg: String) : String = s"[complex] $msg"
  def nome = ""
}

trait z extends ComplexFormat{
  override def nome = "z"
}

class SimpleLogger extends Logging with SimpleFormatLogger {
  def writeLog(msg: String): Unit = println(msg)
}

class FileLogger extends Logging with z with ComplexFormat{
  def writeLog(msg: String): Unit = println(s"[file] $msg")
}

object Teste {
  
  def main(args: Array[String]): Unit = {
    val name : FileLogger = new FileLogger();
    println(name.log("teste"))
  }
}