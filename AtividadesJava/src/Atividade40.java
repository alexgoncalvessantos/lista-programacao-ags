import java.util.Scanner;

public class Atividade40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int quantidade = 5;

        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            soma += scanner.nextInt();
        }

        double media = (double) soma / quantidade;
        System.out.println("A média aritmética dos números é: " + media);

    }
}
