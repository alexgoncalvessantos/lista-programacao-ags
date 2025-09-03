import java.util.Scanner;
public class Atividade9 {
    public static void main(String[] args) {
        //9. Dadas base e altura , calcule perimetro = 2 * (base + altura) e exiba perimetro .
        Scanner leia = new Scanner(System.in);
        double perimetro = 0;
        double base = 0;
        double altura = 0;
        System.out.println("Digite a base:");
        base = leia.nextDouble();
        System.out.println("Digite a altura:");
        altura = leia.nextDouble();
        perimetro = 2 * (base + altura);
        System.out.println( "O perimetro é: " + Math.round(perimetro));
    }
}
//