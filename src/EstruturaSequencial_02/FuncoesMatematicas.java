package EstruturaSequencial_02;

import java.sql.SQLOutput;

public class FuncoesMatematicas {

    public static void main(String[] args) {

        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A, B, C;

        // Raiz Quadrada

        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(z);
        System.out.println("A raiz quadrada de " + x + " é igual a: " + A);
        System.out.println("A raiz quadrada de " + y + " é igual a: " + B);
        System.out.println("A raiz quadrada de " + z + " é igual a: " + C);

        System.out.println("\n=========================================\n");

        // Potência

        A = Math.pow(x, y);
        B = Math.pow(x, 2.0);
        C = Math.pow(5.0, 2.0);
        System.out.println(x + " elevado a " + y + " é igual a: " + A);
        System.out.println(x + " elevado a 2 é igual a: " + B);
        System.out.println("5 elevado a 2 é igual a: " + C);

        System.out.println("\n=========================================\n");

        // Número absoluto

        A = Math.abs(y);
        B = Math.abs(z);
        System.out.println("O número abstrato de: " + y + " é igual a " + A);
        System.out.println("O número abstrato de: " + z + " é igual a " + B);
    }
}
