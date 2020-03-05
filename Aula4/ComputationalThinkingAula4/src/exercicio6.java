import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		//Entrada: Usuário digitará a temperatura em graus Célsius (xC°).
		//Processamento: Realizar a conversão da temperatura em Celsius (xC°) para Fahrenheit (y°F) (x°C × 9/5) + 32 = y°F.
		//Saída: Exibir o valor da temperatura em Fahrenheit (F).
		
		float celsius, fahrenheit;
		
		Scanner leitor = new Scanner (System.in);
			
			System.out.println("Digite a sua temperatura em graus Celsius(C°)");
			celsius = leitor.nextFloat();
			
			leitor.close();
			
			fahrenheit = (celsius*(9/5)+32); 
			
			System.out.println("A sua temperatura em Fahrenheit (F) equivale a " +fahrenheit);

	}

}
