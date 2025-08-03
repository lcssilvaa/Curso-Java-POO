package EstruturaSequencial_02.ExerciciosFixacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        double a, b, c;
        double pi = 3.14159;

        System.out.println("Digite o valor de A, B e C:");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        double areaTriangulo = a * c / 2;
        double areaCirculo = pi * Math.pow(c, 2);
        double areaTrapezio = (a + b) *  c / 2;
        double areaQuadrado = b * b;
        double areaRetangulo = a * b;

        System.out.println("O valor da área do triângulo é igual a: " + areaTriangulo);
        System.out.println("O valor da área do círculo é igual a: " + areaCirculo);
        System.out.println("O valor da área do trapézio é igual a: " + areaTrapezio);
        System.out.println("O valor da área do quadrado é igual a: " + areaQuadrado);
        System.out.println("O valor da área do retângulo é igual a: " + areaRetangulo);
        sc.close();
    }
}
