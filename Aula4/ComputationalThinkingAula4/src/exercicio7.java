import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		// Entrada: Usu�rio digitar� a altura (h) e o raio (R) da lata de �leo.
		//Processamento: Calcular o volume (V) c�bico da lata com a f�rmula V = 3,14 * (R^2) * h.
		//Sa�da: Exibir o volume c�bico(�) de uma lata de �leo.
		
		float h, R, volume;
		
		Scanner leitor = new Scanner(System.in);
			System.out.println("Insira a altura e o raio da sua lata de �leo respectivamente");
			h = leitor.nextFloat();
			R = leitor.nextFloat();
			
			leitor.close();
			
			volume = (float) ((3.14*(R*R)) * h);
			
			System.out.println("O volume c�bico da sua lata de �leo � " +volume);

	}

}
