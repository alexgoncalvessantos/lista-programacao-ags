public class AtividadeSala06 {
    public static void main(String[] args) {
        int a = 5, b = -5, x = 30, y = 9;
        boolean teste, verdadeiro = true, falso = false;
        teste = (a > b) || (a < b);//
        System.out.println("(a >b) || (a < b): " + teste);
        teste = (x > a) && (y > a);//true
        System.out.println("(x > a) && (y > a):" + teste);
        teste = !verdadeiro;
        System.out.println("negação de um valor verdadeiro");

    }
}
