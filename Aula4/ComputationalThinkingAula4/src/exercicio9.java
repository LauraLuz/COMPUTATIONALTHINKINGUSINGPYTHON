import java.util.Scanner;

public class exercicio9 {

	public static void main(String[] args) {
		//Entrada: Usu�rio digitar� o valor de seu sal�rio (s) e suas despesas mensais (m).
		//Processamento: Subtrair o valor das despesas do valor do sal�rio e, com a diferen�a (d), dividir 1 milh�o e depois dividir por 12. (m - s = d, (1.000.000/d)*12 = t)
		//Sa�da: Informar o tempo (t) que o usu�rio precisar� poupar para se tornar milion�rio
		
		float salario, despesas, tempo, diferenca, anos;
		
		Scanner leitor = new Scanner(System.in);
			System.out.println("Insira o valor de seu sal�rio");
			salario = leitor.nextFloat();
			System.out.println("Insira o valor de suas despesas mensais");
			despesas = leitor.nextFloat();

			leitor.close();
			
			diferenca = salario - despesas;
			tempo = 1000000/diferenca;
			anos = tempo/12;
			
			System.out.println("Voc� demorar�  " +anos+ "anos para ficar milhon�rio");

	}

}
