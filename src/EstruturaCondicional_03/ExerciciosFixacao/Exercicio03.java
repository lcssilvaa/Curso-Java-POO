package EstruturaCondicional_03.ExerciciosFixacao;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.println("Digite dois números:");
        a = sc.nextInt();
        b = sc.nextInt();

        if (a % b == 0 || b % a == 0) {
            System.out.println("Os números são multiplos!");
        }
        else {
            System.out.println("Os números não são multiplos");
        }
        sc.close();
    }
}
