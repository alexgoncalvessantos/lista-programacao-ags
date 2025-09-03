import java.util.Scanner;

public class Atividade34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        System.out.println("Números pares de 0 a " + numero + ":");
        int i = 0;
        while (i <= numero) {
            System.out.println(i);
            i += 2;
        }

    }
}
