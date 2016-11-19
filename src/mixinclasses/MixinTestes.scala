package mixinclasses

  
trait AbsIterator {
  type T
  def hasNext: Boolean
  def next: T
}

trait  RichIterator extends AbsIterator {
  def foreach(f: T => Unit) = {
    while(hasNext) f(next)
  }
}

class StringIterator(texto: String) extends AbsIterator {
  type T = Char 
  private var position = 0
  
  def hasNext: Boolean = {
    texto.length() > position
  }

  def next = {
    var ch = texto charAt position
    position += 1
    ch
  }
}

class Iter(text: String) extends StringIterator(text) with RichIterator

object StringIteratorTest {
  def main(args: Array[String]): Unit = {
		  val iter = new Iter("Weliff")
		  iter foreach { t => println(t) }
  }
  
  (x: Int) => x+1 
}
  
