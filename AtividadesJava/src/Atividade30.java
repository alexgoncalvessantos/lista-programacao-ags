import java.util.Scanner;

public class Atividade30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma letra (A, B, C, D): ");
        char letra = scanner.next().toUpperCase().charAt(0);

        switch (letra) {
            case 'A':
                System.out.println("Você escolheu a opção A.");
                break;
            case 'B':
                System.out.println("Você escolheu a opção B.");
                break;
            case 'C':
                System.out.println("Você escolheu a opção C.");
                break;
            case 'D':
                System.out.println("Você escolheu a opção D.");
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

    }
}