import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		//Entrada: Usu�rio digitar� o pre�o do litro do combust�vel (R$/L) e a quantia em dinheiro (R$) que deseja abastecer.
		//Processamento: Realizar a convers�o da quantia informada (R$) para a quantidade de litros (L) que podem ser compradas.
		//Sa�da: Exibir quantos litros (L) podem ser comprados com a quantia informada.

		float combustivel, dinheiro, litros;
		
		Scanner leitor = new Scanner (System.in);
		
			System.out.println("Pre�o do litro do combust�vel ");
			combustivel = leitor.nextFloat();
			System.out.println("Quantia em dinheiro ");
			dinheiro = leitor.nextFloat();
			
			leitor.close();
			
			litros = dinheiro/combustivel; 
		
			System.out.println("A quantidade de litros que voc� conseguir� comprar � " +litros);
		
	}

}
