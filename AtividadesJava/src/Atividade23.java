import java.util.Scanner;

public class Atividade23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int k = scanner.nextInt();

        if (k % 2 == 0) {
            System.out.println("Par.");
        } else {
            System.out.println("Ímpar.");
        }


    }
}
