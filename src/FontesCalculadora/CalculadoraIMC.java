package FontesCalculadora;

public class CalculadoraIMC {
	public double calculaIMC(double peso, double altura) {
		double imcCalculado;
		double alturaAoQuadrado;

		// Calcula a altura ao quadrado
		CalculadoraAritmetica calc = new CalculadoraAritmetica();
		alturaAoQuadrado = calc.multiplicar(altura, altura);

		// Calcula o IMC
		imcCalculado = calc.dividir(peso, alturaAoQuadrado);
		return imcCalculado;

	}
}
