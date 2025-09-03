import java.util.Scanner;

public class Atividade33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade;
        int soma = 0;
        int contador = 0;

        do {
            System.out.print("Digite uma idade (valor negativo para sair): ");
            idade = scanner.nextInt();

            if (idade >= 0) {
                soma += idade;
                contador++;
            }
        } while (idade >= 0);

        if (contador > 0) {
            double media = (double) soma / contador;
            System.out.println("A média das idades é: " + media);
        } else {
            System.out.println("Nenhuma idade válida foi digitada.");
        }
    }
}
