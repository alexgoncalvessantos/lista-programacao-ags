import java.util.Scanner;

public class Atividade32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senha;

        do {
            System.out.print("Digite a senha: ");
            senha = scanner.next();
        } while (!senha.equals("1234"));

        System.out.println("Acesso permitido.");
    }
}