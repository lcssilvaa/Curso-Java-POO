package EstruturaCondicional_03.ExerciciosFixacao;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x;

        System.out.println("Digite um número:");
        x = sc.nextInt();

        if (x % 2 == 0) {
            System.out.println("Seu número é par!");
        }
        else {
            System.out.println("Seu número é impar!");
        }
        sc.close();
    }
}
