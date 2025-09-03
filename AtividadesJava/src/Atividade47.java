import java.util.Scanner;

public class Atividade47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        System.out.println("Preencha a matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Elementos da diagonal principal:");
        for (int i = 0; i < 3; i++) {
            System.out.println(matriz[i][i]);
        }

    }
}