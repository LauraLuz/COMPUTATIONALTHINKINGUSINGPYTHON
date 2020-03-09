import java.util.Scanner;

public class exercicio10 {
  public static void main(String[] args) {
    //Entrada: usuÃ¡rio informa quantos votos cada cadidato recebeu (A, B, C), nÃºmero de votos nulos e brancos
    //Processamento: o algoritmo deve calcular e informar o nÃºmero total de eleitores, o percentual de votos de cada candidato (candidato/total), percentual de brancos e nulos
    //SaÃ­da:

    int total, candidatoA, candidatoB, candidatoC, brancos, nulos;

    Scanner leitor = new Scanner(System.in);
      System.out.println("Insira número de votos do Candidato A: ");
      candidatoA = leitor.nextInt();
      System.out.println("Insira número de votos do Candidato B: ");
      candidatoB = leitor.nextInt();
      System.out.println("Insira número de votos do Candidato C: ");
      candidatoC = leitor.nextInt();
      System.out.println("Insira número de votos Nulos: ");
      nulos = leitor.nextInt();
      System.out.println("Insira número de votos Brancos: ");
      brancos = leitor.nextInt();

      leitor.close();

      total = candidatoA + candidatoB + candidatoC + brancos + nulos;

      System.out.println("Total de eleitores: " + total);
      System.out.println("Percentual de votos ");
      System.out.println("	Candidato A: " + ((candidatoA*100)/total) + "%" + "\n" +
                         "	Candidato B: " + ((candidatoB*100)/total) + "%" + "\n" +
                         "	Candidato C: " + ((candidatoC*100)/total) + "%");

      System.out.println("	Percentual de votos Brancos: " + ((brancos*100)/total) + "%");
      System.out.println("	Percentual de votos Nulos: " + ((nulos*100)/total) + "%");

  }

}
