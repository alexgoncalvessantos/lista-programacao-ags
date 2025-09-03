import java.util.Scanner;

public class Atividade45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor1 = new int[5];
        int[] vetor2 = new int[5];
        int[] vetorSoma = new int[5];

        System.out.println("Preencha o primeiro vetor:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Posição " + i + ": ");
            vetor1[i] = scanner.nextInt();
        }

        System.out.println("\nPreencha o segundo vetor:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Posição " + i + ": ");
            vetor2[i] = scanner.nextInt();
            vetorSoma[i] = vetor1[i] + vetor2[i];
        }

        System.out.println("\nResultado da soma dos vetores:");
        for (int i = 0; i < 5; i++) {
            System.out.println("vetorSoma[" + i + "] = " + vetorSoma[i]);
        }

    }
}