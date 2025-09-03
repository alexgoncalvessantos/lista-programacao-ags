import java.util.Scanner;

public class Atividade18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número (p): ");
        int p = scanner.nextInt();

        System.out.print("Digite o segundo número (q): ");
        int q = scanner.nextInt();

        if (p > q) {
            System.out.println("p é maior que q.");
        } else if (p < q) {
            System.out.println("p é menor que q.");
        } else {
            System.out.println("p é igual a q.");
        }


    }
}
