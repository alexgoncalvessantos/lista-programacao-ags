public class AtividadeSala07 {

    public static void main(String[] args) {
int a = 5, b = -5, x = 30, y = 9;
if (a < 0 && b < 0 && x < 0 && y < 0) {
    System.out.println("todos os valores são negativos");
}else if(a < 0 || b < 0 || x < 0 || y < 0){
    System.out.println("pelo menos um valor é negativo.");
} else {
    System.out.println("todos os valores são positivos");
}
char opcao = 'S';
        switch (opcao){
            case 'S':
                System.out.println("A opção 'S' foi escolhida");
                break;
            case 'N':
            default:
        }

    }
}
