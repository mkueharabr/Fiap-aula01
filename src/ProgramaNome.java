import java.util.Scanner;

public class ProgramaNome {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		String nome;
		
		System.out.print("Por favor, digite o seu nome: ");
		
		// next lê apenas até o espaço. Para ler com espaço é necesário o nextLine
		nome = leitor.nextLine();
		
		System.out.println("Que legal o seu nome é: " + nome);
		
		leitor.close();
	}

}
