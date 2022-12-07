package nati.sousa.segundaaula;

public class TiposVariaveis {

    // tipos primitivos de dados

    double salarioMinimo = 2500;
    double peso = 57.3;

    short numeroCurto = 1;
    int numeroNormal = numeroCurto;
    short numeroCurto2 = (short) numeroNormal; // devemos fazer o casting para que ele aceite o tipo dado

    // declaração de uma constante precisa da palavra reservada final
    final double VALOR_DE_PI = 3.14;

}
