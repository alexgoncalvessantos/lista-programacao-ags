import java.util.Scanner;

public class Atividade39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de termos da sequência de Fibonacci: ");
        int n = scanner.nextInt();

        long termo1 = 0;
        long termo2 = 1;

        if (n >= 1) {
            System.out.print(termo1);
        }
        for (int i = 2; i <= n; i++) {
            System.out.print(" " + termo2);
            long proximoTermo = termo1 + termo2;
            termo1 = termo2;
            termo2 = proximoTermo;
        }

        System.out.println();

    }
}
