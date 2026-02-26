package FontesCalculadora;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("Digite o primeiro valor");
			int valor1 = sc.nextInt();
			
			System.out.println("Digite o segundo valor");
			int valor2 = sc.nextInt();
			
			CalculadoraAritmetica c = new CalculadoraAritmetica();
			System.out.println("Soma: " + c.somar(valor1, valor2));
		} catch(InputMismatchException e) {
			System.err.println("Número inválido, tente novamente");
		} catch(NoSuchElementException e) {
			System.err.println("Favor preencher o numéro.");
		} catch (Exception e) {
			System.err.println("Erro desconhecido" + e);// TODO: handle exception
		}
		sc.close();
		
		
	}
}
