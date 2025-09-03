import java.util.Scanner;

public class Atividade35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int maior = Integer.MIN_VALUE;

        System.out.println("Digite uma sequência de números (digite -1 para parar):");
        while (true) {
            numero = scanner.nextInt();
            if (numero == -1) {
                break;
            }
            if (numero > maior) {
                maior = numero;
            }
        }

        if (maior != Integer.MIN_VALUE) {
            System.out.println("O maior número digitado foi: " + maior);
        } else {
            System.out.println("Nenhum número foi digitado.");
        }
    }
}