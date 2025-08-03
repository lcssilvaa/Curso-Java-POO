package EstruturaSequencial_02.ExerciciosFixacao;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int codigoP1, codigoP2, numeroP1, numeroP2;
        double valorP1, valorP2;

        System.out.println("=== Peça 1 ===");

        System.out.println("\nQual o código da peça 1?");
        codigoP1 = sc.nextInt();
        System.out.println("Qual vai ser a quantidade de peças?");
        numeroP1 = sc.nextInt();
        System.out.println("Qual o valor por peça?");
        valorP1 = sc.nextDouble();

        System.out.println("\n=== Peça 2 ===");

        System.out.println("\nQual o código da peça 2?");
        codigoP2 = sc.nextInt();
        System.out.println("Qual vai ser a quantidade de peças?");
        numeroP2 = sc.nextInt();
        System.out.println("Qual o valor por peça?");
        valorP2 = sc.nextDouble();

        double valorTotalP1 = numeroP1 * valorP1;
        double valorTotalP2 = numeroP2 * valorP2;
        double valorTotal = valorTotalP1 + valorTotalP2;

        System.out.printf("O valor total do item " + codigoP1 + " é igual a: R$ %.2f%n", valorTotalP1);
        System.out.printf("O valor total do item " + codigoP2 + " é igual a: R$ %.2f%n", valorTotalP2);
        System.out.printf("O valor total a ser pago é igual a: R$ %.2f%n", valorTotal);
        sc.close();
    }
}
