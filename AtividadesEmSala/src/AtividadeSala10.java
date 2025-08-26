import java.util.Scanner;

public class AtividadeSala10 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um numero inteiro de 0 a 10");
        int numero = leia.nextInt();
       int contador= 0;

        System.out.println("A tabuada de" + numero + "é: ");
        while(contador <=10){
            System.out.println(numero + "*" + contador + "=" + (numero * contador));
        contador++;
        }




    }
}
