package EstruturaSequencial_02.ExerciciosFixacao;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A, B, C, D, diferenca;

        System.out.println("Digite quatro números:");
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        diferenca = (A * B - C * D);

        System.out.println("A diferença do produto de A e B pelo produto de C e D é igual a: " + diferenca);
        sc.close();
    }
}
