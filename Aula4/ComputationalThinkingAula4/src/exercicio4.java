import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		//Entrada: O usuário digitará a cotação do dólar (1$ = xR$) e o seu montante em reais (mR$).
		//Processamento: Realizar a conversão do montante de reais do usuário em dólar (1$*mR$/xR$ = q$).
		//Saída: Exibir o valor em dólar (q$) da quantia em reais que o usuário têm.
		
		
		float dolar, montante, quantia;
		
		Scanner leitor = new Scanner (System.in);
		
			System.out.println("Digite a cotação do dolar hoje ");
			dolar = leitor.nextFloat();
			System.out.println("Digite o seu montante em reais ");
			montante = leitor.nextFloat();
			
			leitor.close();
			
			quantia = montante/dolar;
		
			System.out.println("Valor do seu montante em dolar é " +quantia);
	}

}
