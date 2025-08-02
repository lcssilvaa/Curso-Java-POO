package EstruturaSequencial_02;

import java.util.Locale;

public class SaidaDeDados {

    public static void main(String[] args) {

        double x = 10.35784;
        String nome = "Maria";
        int idade = 31;
        int renda = 4000;

        System.out.println(x);
        System.out.printf("%.2f%n", x); // formatar a variável em 2 casas decimais
        System.out.printf("%.4f%n", x); // formatar a variável em 4 casas decimais

        Locale.setDefault(Locale.US); // coloca . ao invés de ,
        System.out.printf("%.4f%n", x);

        System.out.println("Resultado: " + x); // concatenação

        System.out.println(nome + " tem " + idade + " anos de idade " + "e recebe " + renda + " reais");
    }
}
