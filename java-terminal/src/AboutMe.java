import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Informe sua altura: ");
        double altura = entrada.nextDouble();

        System.out.print("Informe seu nome:");
        String nome = entrada.next();

        System.out.print("Informe seu sobrenome: ");
        String sobrenome = entrada.next();

        System.out.print("Informe sua idade: ");
        int idade = entrada.nextInt();

        System.out.println("Olá, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + "cm");
    }
}
