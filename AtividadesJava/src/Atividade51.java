import java.util.Scanner;

public class Atividade51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        int resultado = somar(num1, num2);
        System.out.println("A soma de " + num1 + " e " + num2 + " é: " + resultado);

    }

    public static int somar(int a, int b) {
        return a + b;
    }
}