import java.util.Scanner;
public class Atividade11 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        //11. Idade em meses: dada idadeAnos , calcule idadeMeses = idadeAnos * 12 e exiba
        //idadeMeses .
        int idade = 0;
        double meses = 0;
        System.out.println("Digite sua idade:");
        idade = leia.nextInt();

       meses =  idade * 12;

        System.out.println("A idade: " + idade +" em meses é: " + Math.round(meses));
    }
}
//a