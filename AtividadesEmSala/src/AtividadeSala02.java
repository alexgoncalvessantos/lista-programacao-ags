public class AtividadeSala02 {
    public static void main(String[] args){
        String nome = "Alex";
        String sobrenome = "Santos";
        int idade = 19;
        double peso = 53;
        double altura = 1.8;
        double imc = 0;
        System.out.println(nome + " " + sobrenome);
        int anoNasc = 2025 - idade;
        System.out.println("Ano de Nascimento:" + anoNasc);
        String txtPesoAltura= "Peso:" + peso + " Altura:" + altura;
        System.out.println(txtPesoAltura);
        imc = peso/(altura*altura);
        System.out.println("Base calc IMC:" + peso);



    }
}
