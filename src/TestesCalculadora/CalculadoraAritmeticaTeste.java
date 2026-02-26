package TestesCalculadora;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import FontesCalculadora.CalculadoraAritmetica;

public class CalculadoraAritmeticaTeste {

	//Atributos das operações
	double resultadoEsperado;
	double resultadoReal;
	static int contador = 0;
	String nomeTeste = "";
	CalculadoraAritmetica calc = new CalculadoraAritmetica();
	
    @Before
    public void preparaTestes() {
    	contador = contador++;
    	System.out.println("Iniciar teste de número: " + contador);
    }
    
    @After
    public void finalizaTestes() {
    	contador++;
	System.out.print("Teste " + nomeTeste  + " finalizado");
	System.out.println( "- resultado: " + resultadoReal);
    }
	
	//Método de teste
	@Test
	public void testSomar2Com5() {
		nomeTeste = "testSomar2Com5";

		resultadoEsperado = 7;
		resultadoReal = calc.somar(2,5);
		
		assertEquals(resultadoReal, resultadoEsperado, 0);
	}
	
	@Test
	public void testSomar3Com5() {
		resultadoEsperado = 8;
		resultadoReal = calc.somar(3,5);
		
		assertEquals(resultadoReal, resultadoEsperado, 0);
	}
	
	@Test
	public void testSubtrair5de10() {
		nomeTeste = "testSubtrair5de10";

		resultadoEsperado = 5;
		resultadoReal = calc.subtrair(10,5);
		
		assertEquals(resultadoReal, resultadoEsperado, 0);
	}
	
	@Test
	public void testeMultiplicar3por2() {
		nomeTeste = "testeMultiplicar3por2";
		resultadoEsperado = 6;
		resultadoReal = calc.multiplicar(3,2);
		
		assertEquals(resultadoReal, resultadoEsperado, 0.5);
	}
	
	@Test
	public void testDividir() {
		nomeTeste = "testDividir";
		double nro1 = 3;
		double nro2 = 2;
		
		resultadoEsperado = 1.5;
		resultadoReal = calc.dividir(nro1,nro2);
		
		assertEquals(resultadoReal, resultadoEsperado, 0.1);
		
	}

}
