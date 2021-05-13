import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double valor1;
		double valor2;
		double soma, divisao, subtracao, multiplicacao;
		
		System.out.println("Por favor, digite o primeiro valor: ");
		valor1 = leitor.nextDouble();
		
		System.out.println("Por favor, digite o segundo valor: ");
		valor2 = leitor.nextDouble();
		
		soma = valor1 + valor2;
		subtracao = valor1 - valor2;
		divisao = valor1/valor2;
		multiplicacao = valor1 * valor2;
		
		System.out.println("A soma dos dois valores é " + soma);
		System.out.println("A multiplicacao dos dois valores é " + multiplicacao);
		System.out.println("A divisao dos dois valores é " + divisao);
		System.out.println("A subtracao dos dois valores é " + subtracao);
		
		leitor.close();
	}

}
