import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		//Entrada: Usuário digitará o preço do litro do combustível (R$/L) e a quantia em dinheiro (R$) que deseja abastecer.
		//Processamento: Realizar a conversão da quantia informada (R$) para a quantidade de litros (L) que podem ser compradas.
		//Saída: Exibir quantos litros (L) podem ser comprados com a quantia informada.

		float combustivel, dinheiro, litros;
		
		Scanner leitor = new Scanner (System.in);
		
			System.out.println("Preço do litro do combustível ");
			combustivel = leitor.nextFloat();
			System.out.println("Quantia em dinheiro ");
			dinheiro = leitor.nextFloat();
			
			leitor.close();
			
			litros = dinheiro/combustivel; 
		
			System.out.println("A quantidade de litros que você conseguirá comprar é " +litros);
		
	}

}
