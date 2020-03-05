import java.util.Scanner;

public class exercicio9 {

	public static void main(String[] args) {
		//Entrada: Usuário digitará o valor de seu salário (s) e suas despesas mensais (m).
		//Processamento: Subtrair o valor das despesas do valor do salário e, com a diferença (d), dividir 1 milhão e depois dividir por 12. (m - s = d, (1.000.000/d)*12 = t)
		//Saída: Informar o tempo (t) que o usuário precisará poupar para se tornar milionário
		
		float salario, despesas, tempo, diferenca, anos;
		
		Scanner leitor = new Scanner(System.in);
			System.out.println("Insira o valor de seu salário");
			salario = leitor.nextFloat();
			System.out.println("Insira o valor de suas despesas mensais");
			despesas = leitor.nextFloat();

			leitor.close();
			
			diferenca = salario - despesas;
			tempo = 1000000/diferenca;
			anos = tempo/12;
			
			System.out.println("Você demorará  " +anos+ "anos para ficar milhonário");

	}

}
