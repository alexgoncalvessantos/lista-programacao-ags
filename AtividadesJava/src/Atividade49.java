import java.util.Scanner;

public class Atividade49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] notas = new double[3][2];

        for (int i = 0; i < 3; i++) {
            System.out.println("Notas do aluno " + (i + 1) + ":");
            for (int j = 0; j < 2; j++) {
                System.out.print("Nota da prova " + (j + 1) + ": ");
                notas[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("\nMédias dos alunos:");
        for (int i = 0; i < 3; i++) {
            double soma = notas[i][0] + notas[i][1];
            double media = soma / 2;
            System.out.println("Aluno " + (i + 1) + ": " + media);
        }

    }
}