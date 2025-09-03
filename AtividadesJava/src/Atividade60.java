import java.util.Scanner;

public class Atividade60 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro lado (a): ");
        int a = scanner.nextInt();

        System.out.print("Digite o segundo lado (b): ");
        int b = scanner.nextInt();

        System.out.print("Digite o terceiro lado (c): ");
        int c = scanner.nextInt();

        verificarTriangulo(a, b, c);
    }

    public static void verificarTriangulo(int a, int b, int c) {
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Os lados " + a + ", " + b + " e " + c + " podem formar um triângulo.");
        } else {
            System.out.println("Os lados " + a + ", " + b + " e " + c + " não podem formar um triângulo.");
        }
    }
}