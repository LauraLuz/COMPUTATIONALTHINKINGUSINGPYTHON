import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		//Entrada: O usu�rio digitar� a cota��o do d�lar (1$ = xR$) e o seu montante em reais (mR$).
		//Processamento: Realizar a convers�o do montante de reais do usu�rio em d�lar (1$*mR$/xR$ = q$).
		//Sa�da: Exibir o valor em d�lar (q$) da quantia em reais que o usu�rio t�m.
		
		
		float dolar, montante, quantia;
		
		Scanner leitor = new Scanner (System.in);
		
			System.out.println("Digite a cota��o do dolar hoje ");
			dolar = leitor.nextFloat();
			System.out.println("Digite o seu montante em reais ");
			montante = leitor.nextFloat();
			
			leitor.close();
			
			quantia = montante/dolar;
		
			System.out.println("Valor do seu montante em dolar � " +quantia);
	}

}
