import java.util.Scanner;

public class Atividade24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        int quadrado = numero * numero;

        if (quadrado > 100) {
            System.out.println("Quadrado calculado.");
        } else {
            System.out.println("Quadrado pequeno ou igual a 100.");
        }


    }
}