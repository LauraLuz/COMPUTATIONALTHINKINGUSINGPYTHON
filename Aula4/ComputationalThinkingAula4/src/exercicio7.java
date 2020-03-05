import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		// Entrada: Usuário digitará a altura (h) e o raio (R) da lata de óleo.
		//Processamento: Calcular o volume (V) cúbico da lata com a fórmula V = 3,14 * (R^2) * h.
		//Saída: Exibir o volume cúbico(³) de uma lata de óleo.
		
		float h, R, volume;
		
		Scanner leitor = new Scanner(System.in);
			System.out.println("Insira a altura e o raio da sua lata de óleo respectivamente");
			h = leitor.nextFloat();
			R = leitor.nextFloat();
			
			leitor.close();
			
			volume = (float) ((3.14*(R*R)) * h);
			
			System.out.println("O volume cúbico da sua lata de óleo é " +volume);

	}

}
