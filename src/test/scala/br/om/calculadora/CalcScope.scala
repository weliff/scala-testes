package test.scala.br.om.calculadora

import org.specs2.specification.Scope
import br.com.calculadora.Calculadora

trait CalcScope extends Scope{
  val calc = new Calculadora
  
  
  def init() = {
    println("inicializando configurações de teste")
  }
}