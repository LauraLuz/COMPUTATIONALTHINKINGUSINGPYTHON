import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		//Entrada: O usuário informará 4 valores (n1, n2, n3, n4)
		//Processamento: Multiplicar o primeiro valor pelo terceiro valor e somar o segundo valor e o quarto (n1*n3 = x , n2+n4 = y)
		//Saída: Mostrar o produto (x) do primeiro valor com o terceiro e a soma (y) do segundo com o quarto
		
			int n1, n2, n3, n4, multi, soma;
		
			Scanner leitor = new Scanner (System.in);
		
				System.out.println("Digite quatro números inteiros");
				n1 = leitor.nextInt();
				n2 = leitor.nextInt();
				n3 = leitor.nextInt();
				n4 = leitor.nextInt();
				
				leitor.close();
				
				multi = n1*n3;
				soma =  n2+n4;
				
				System.out.println("O resultado do produto do 1° e 3° números é " +multi);

				System.out.println("O resultado da soma do 2° e 4° números é "  +soma);
		
	}

}
