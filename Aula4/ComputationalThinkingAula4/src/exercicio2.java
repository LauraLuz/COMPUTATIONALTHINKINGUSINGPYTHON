import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		//Entrada: O usu�rio digitar� 3 n�meros inteiros (n1, n2, n3)
		//Processamento: Somar os tr�s valores obtidos e o resultado desta soma, multiplicar por ele mesmo (n1+n2+n3 = n4^2 = n5)
		//Sa�da: Mostrar o valor quadrado da soma dos valores (n5).
		
		int n1, n2, n3,soma, resultado;
		// int n4, n5
		
		Scanner leitor = new Scanner (System.in);
		
			System.out.println("Digite tr�s n�meros inteiros");
			n1 = leitor.nextInt();
			
			n2 = leitor.nextInt();
			
			n3 = leitor.nextInt();
			
			leitor.close();
			
			soma = n1+n2+n3;
			resultado = soma*soma;
			
			//n1+n2+n3 = n4^2 = n5;
			//n4 = n1 + n2 + n3;
			//n5 = n4 * n4;
			
			System.out.println("O resultado do seu c�lculo � " +resultado);

	}

}
