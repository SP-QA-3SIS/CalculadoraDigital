package TestesCalculadora;

import static org.junit.Assert.*;

import org.junit.Test;

import FontesCalculadora.CalculadoraIMC;

public class CalculadoraIMCTeste {

	@Test
	public void testCalculoIMCPeso100Altura() {
		double ImcEsperado = 25;

		double resultadoImcReal;
		CalculadoraIMC calc = new CalculadoraIMC();
		resultadoImcReal = calc.calculaIMC(100, 2);

		assertEquals(ImcEsperado, resultadoImcReal, 0);

	}

}
