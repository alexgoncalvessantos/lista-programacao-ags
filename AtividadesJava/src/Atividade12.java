import java.util.Scanner;
public class Atividade12 {
    public static void main(String[] args) {
        //12. Divisão inteira e resto: dados x e y , calcule quociente = x / y (inteira) e resto = x % y ;
        double x = 0;
        double y = 0;
        double divisao = 0;
        double resto = 0;
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite sua o numero a ser dividido:");
        x = leia.nextInt();
        System.out.println( x + " Dividido por:");
        y = leia.nextInt();
        divisao = x / y;
        resto =  x % y;
        System.out.println("O quociente é: " + divisao + " o resto dessa divisão é: "+ resto);

    }
}
//a