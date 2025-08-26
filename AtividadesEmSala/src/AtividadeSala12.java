import java.util.Scanner;

public class AtividadeSala12 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double[] notas = new double[3];
        double media = 0, soma = 0;
        //double[] notas = {0,0,0};
        for (int i = 0; i < 3; i++) {
            System.out.println("digite a primeira nota");
            notas[i] = leia.nextDouble();
            soma += notas[i];
            if (i == 2) media = soma / notas.length;
        }
        System.out.println("A média das notas é:" + media);
    }
}