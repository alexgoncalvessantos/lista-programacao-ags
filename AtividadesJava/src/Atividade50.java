import java.util.Scanner;

public class Atividade50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrizOriginal = new int[3][3];
        int[][] matrizQuadrado = new int[3][3];

        System.out.println("Preencha a matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matrizOriginal[i][j] = scanner.nextInt();
                matrizQuadrado[i][j] = matrizOriginal[i][j] * matrizOriginal[i][j];
            }
        }

        System.out.println("\nMatriz original:");
        imprimirMatriz(matrizOriginal);

        System.out.println("\nMatriz com valores ao quadrado:");
        imprimirMatriz(matrizQuadrado);

    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
