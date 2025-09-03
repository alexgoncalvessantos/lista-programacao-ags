import java.util.Scanner;

public class Atividade59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[10];

        System.out.println("Preencha o vetor com 10 números reais:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }

        calcularEExibirMedia(numeros);
    }

    public static void calcularEExibirMedia(double[] vetor) {
        double soma = 0;
        for (double numero : vetor) {
            soma += numero;
        }
        double media = soma / vetor.length;
        System.out.println("A média aritmética do vetor é: " + media);
    }
}
