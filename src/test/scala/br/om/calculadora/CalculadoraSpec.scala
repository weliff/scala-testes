package test.scala.br.om.calculadora

import org.specs2.mutable.Specification
import br.com.calculadora.Calculadora

class CalculadoraSpec extends Specification {
  
  "fazer calculos com a calculadora" >> {
	  "Deve somar 1 + 1 e retornar 2" >> new CalcScope {
		  init()
		  calc.soma(1, 1) must_== 2
	  }
	  
	  "Deve somar 1 + 2 e retornar 3" >> new CalcScope {
	    init()
		  calc.soma(1, 2) must beEqualTo(3)
	  }
 
  }
}