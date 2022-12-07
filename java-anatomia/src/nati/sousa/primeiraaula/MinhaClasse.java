package nati.sousa.primeiraaula;

public class MinhaClasse {
    public static void main(String[] args) {

        String primeiroNome = "Natália";
        String segundoNome = "Sousa";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.print(nomeCompleto);

    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
