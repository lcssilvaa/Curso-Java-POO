package EstruturaCondicional_03.ExerciciosFixacao;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x;

        System.out.println("Digite um número:");
        x = sc.nextInt();

        if (x < 0) {
            System.out.println("Seu número é negativo!");
        }
        else {
            System.out.println("Seu número é positivo!");
        }
        sc.close();
    }
}
