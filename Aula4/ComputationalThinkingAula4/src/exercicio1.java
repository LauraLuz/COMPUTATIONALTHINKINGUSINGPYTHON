import java.util.Scanner;



public class exercicio1 {

	public static void main(String[] args) {
		//Entrada: O usu�rio digitar� um n�mero
		//Processamento: Multiplicar o n�mero digitado por ele mesmo
		//Sa�da: Mostrar na tela o resultado da multiplica��o
		
		int numero, resultado;
		
		Scanner leitor = new Scanner(System.in);
		
			System.out.println("Digite um n�mero: ");
			numero = leitor.nextInt();
			
			leitor.close();
			
			resultado = numero*numero;
			
			System.out.println("Quadrado do n�mero digitado: " +resultado);
			
			
			
			

	}

}
