import java.util.Scanner;
public class Atividade10 {
    //10. Converta temperatura: dada celsius , calcule fahrenheit = (9 * celsius) / 5 + 32 e
    //exiba fahrenheit .
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        int celsius = 0;
        double fahrenheit = 0;
        System.out.println("Digite a quantidade de graus Cº:");
        celsius = leia.nextInt();

        fahrenheit = (9 * celsius) / 5 + 32;

        System.out.println("A temperatura " + celsius +"Cº em fahrenheit é: " + Math.round(fahrenheit));
    }
}//