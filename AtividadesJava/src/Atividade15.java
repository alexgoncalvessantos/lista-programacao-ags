import java.util.Scanner;

public class Atividade15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor inicial de x: ");
        int x = scanner.nextInt();

        System.out.println("Valor inicial de x: " + x);

        x += 5;
        System.out.println("Depois de x += 5, x é: " + x);

        x *= 2;
        System.out.println("Depois de x *= 2, x é: " + x);

        x -= 4;
        System.out.println("Depois de x -= 4, x é: " + x);

        System.out.println("Valor final de x: " + x);
        scanner.close();
    }
}
