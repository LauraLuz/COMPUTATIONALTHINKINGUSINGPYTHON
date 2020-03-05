import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		//Entrada: O usuário digitará 3 números inteiros (n1, n2, n3)
		//Processamento: Somar os três valores obtidos e o resultado desta soma, multiplicar por ele mesmo (n1+n2+n3 = n4^2 = n5)
		//Saída: Mostrar o valor quadrado da soma dos valores (n5).
		
		int n1, n2, n3,soma, resultado;
		// int n4, n5
		
		Scanner leitor = new Scanner (System.in);
		
			System.out.println("Digite três números inteiros");
			n1 = leitor.nextInt();
			
			n2 = leitor.nextInt();
			
			n3 = leitor.nextInt();
			
			leitor.close();
			
			soma = n1+n2+n3;
			resultado = soma*soma;
			
			//n1+n2+n3 = n4^2 = n5;
			//n4 = n1 + n2 + n3;
			//n5 = n4 * n4;
			
			System.out.println("O resultado do seu cálculo é " +resultado);

	}

}
