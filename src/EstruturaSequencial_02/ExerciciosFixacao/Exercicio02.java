package EstruturaSequencial_02.ExerciciosFixacao;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;
        double raio;

        System.out.println("Digite o raio do círculo:");
        raio = sc.nextDouble();

        double area = pi * Math.pow(raio, 2);

        System.out.printf("O valor do área é igual a: " + area);
        sc.close();
    }
}
