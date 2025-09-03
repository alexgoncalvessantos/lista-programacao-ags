import java.util.Scanner;

public class Atividade17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número (n): ");
        int n = scanner.nextInt();
        int quadrado = n * n;

        System.out.println("O quadrado de " + n + " é: " + quadrado);

    }
}