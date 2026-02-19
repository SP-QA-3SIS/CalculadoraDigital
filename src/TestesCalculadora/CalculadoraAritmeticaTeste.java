package TestesCalculadora;

import static org.junit.Assert.*;

import org.junit.Test;

import FontesCalculadora.CalculadoraAritmetica;

public class CalculadoraAritmeticaTeste {

	//Atributos das operações
	int resultadoEsperado;
	int resultadoReal;
	CalculadoraAritmetica calc = new CalculadoraAritmetica();
	
	//Método de teste
	@Test
	public void testSomar2Com5() {
		resultadoEsperado = 7;
		resultadoReal = calc.somar(2,5);
		
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test
	public void testSomar3Com5() {
		resultadoEsperado = 8;
		resultadoReal = calc.somar(3,5);
		
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test
	public void testSubtrair10com5() {
		resultadoEsperado = -5;
		resultadoReal = calc.subtrair(10,5);
		
		assertEquals(resultadoReal, resultadoEsperado);
	}

}
