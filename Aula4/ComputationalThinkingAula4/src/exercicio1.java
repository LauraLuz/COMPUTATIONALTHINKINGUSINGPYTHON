import java.util.Scanner;



public class exercicio1 {

	public static void main(String[] args) {
		//Entrada: O usuário digitará um número
		//Processamento: Multiplicar o número digitado por ele mesmo
		//Saída: Mostrar na tela o resultado da multiplicação
		
		int numero, resultado;
		
		Scanner leitor = new Scanner(System.in);
		
			System.out.println("Digite um número: ");
			numero = leitor.nextInt();
			
			leitor.close();
			
			resultado = numero*numero;
			
			System.out.println("Quadrado do número digitado: " +resultado);
			
			
			
			

	}

}
