import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		//Entrada: O usu�rio digitar� o valor de um boleto (R$), o percentual de juros e o n�mero de dias em atraso. 
		//Processamento: Calcular o novo valor a ser pago com a f�rmula NOVO VALOR = VALOR BOLETO + (VALOR BOLETO * (JUROS/100)) * DIAS.
		//Sa�da: Exibir novo valor a ser pago.
		
		float boleto, juros, atraso, novoBoleto;
		
		Scanner leitor = new Scanner(System.in);
			System.out.println("Insira o valor de um boleto");
			boleto = leitor.nextFloat();
			System.out.println("Insira o valor do percentual de juros");
			juros = leitor.nextFloat();
			System.out.println("Insira o n�mero de dias em atraso");
			atraso = leitor.nextFloat();
			
			leitor.close();
			
			novoBoleto = boleto + (boleto*(juros/100)*atraso);
			
			System.out.println("O valor do novo boleto a ser pago � de   " +novoBoleto);

	}

}
