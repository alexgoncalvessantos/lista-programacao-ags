import java.util.Scanner;

public class Atividade55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro para calcular o fatorial: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("O fatorial de um número negativo não existe.");
        } else {
            long resultadoFatorial = fatorial(numero);
            System.out.println("O fatorial de " + numero + " é: " + resultadoFatorial);
        }

    }

    public static long fatorial(int n) {
        if (n < 0) {
            return -1;
        }
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}