import java.util.Scanner;

public class Atividade48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int maior = Integer.MIN_VALUE;
        int linhaMaior = 0;
        int colunaMaior = 0;

        System.out.println("Preencha a matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                }
            }
        }

        System.out.println("O maior valor é " + maior + " e está na posição [" + linhaMaior + "][" + colunaMaior + "].");
    }
}