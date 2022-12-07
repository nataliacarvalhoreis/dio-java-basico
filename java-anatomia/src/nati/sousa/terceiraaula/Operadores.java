package nati.sousa.terceiraaula;

public class Operadores {
    public static void main(String[] args) {
        // operador de atribuição
        String nome = "Natália Sousa";
        int idade = 35;
        double peso = 65.7;
        char sexo = 'F';
        boolean doarOrgao = true;

        // operadores aritméticos
        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (30 / 4);

        // operador de adição usado com textos faz a concatenação
        String nomeCompleto = "LINGUAGEM" + "JAVA";

        System.out.println(nomeCompleto);

        String concatenacao = "?";
        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + 1;
        System.out.println(concatenacao);

        // operadores unários
        int numero = 5;
        numero = -(numero);
        System.out.println(numero);
        numero++;
        System.out.println(numero);

        boolean variavel = true;
        System.out.println(!variavel);

        // operador ternário
        int a, b;
        a = 5;
        b = 6;
        // igual a expressão if. Testa a igualdade e depois atribui o valor dependendo
        // do resultado do teste.
        String result = a == b ? "verdadeiro" : "falso";
        System.out.println(result);

    }
}
