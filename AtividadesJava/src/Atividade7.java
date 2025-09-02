import java.util.Scanner;
public class Atividade7 {
    //Leia dois inteiros a e b ; calcule soma = a + b e exiba soma
     public static void main(String[] args) {
         Scanner leia = new Scanner(System.in);
         int a = 0;
        int b= 0;
         System.out.println("Digite o primeiro número:" );
a = leia.nextInt();
         System.out.println("Digite o segundo número:" );
b = leia.nextInt();
         System.out.println("Soma: " + (a + b ) );
    }
}
