import java.util.Scanner;

public class Atividade58 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] minhaMatriz = new int[3][3];

        System.out.println("Preencha a matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                minhaMatriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nMatriz preenchida:");
        exibirMatriz(minhaMatriz);
    }

    public static void exibirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
