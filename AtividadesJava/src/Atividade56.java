import java.util.Scanner;

public class Atividade56 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] meuVetor = new int[5];

        System.out.println("Preencha o vetor com 5 números inteiros:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            meuVetor[i] = scanner.nextInt();
        }

        exibirVetor(meuVetor);

    }

    public static void exibirVetor(int[] vetor) {
        System.out.println("Elementos do vetor:");
        for (int elemento : vetor) {
            System.out.println(elemento);
        }
    }
}