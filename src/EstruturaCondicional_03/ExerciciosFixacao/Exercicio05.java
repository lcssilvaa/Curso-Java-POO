package EstruturaCondicional_03.ExerciciosFixacao;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int codigo, quantidade;
        double valor = 0;

        System.out.println("Menu");
        System.out.println("\n 1. Cachorro Quente - R$ 4.00");
        System.out.println("2. X-Salada - R$ 4.50");
        System.out.println("3. X-Bacon - R$ 5.00");
        System.out.println("4. Torrada Simples - R$ 2.00");
        System.out.println("5. Refrigerante - R$ 1.50");

        System.out.println("\nEscolha o item pelo código");
        codigo = sc.nextInt();
        System.out.println("Qual será a quantidade?");
        quantidade = sc.nextInt();

        if (codigo == 1) {
              valor = 4 * quantidade;
        }
        else if (codigo == 2) {
             valor = 4.50 * quantidade;
        }
        else if (codigo == 3) {
             valor = 5 * quantidade;
        }
        else if (codigo == 4) {
             valor = 2 * quantidade;
        }
        else if (codigo == 5) {
             valor = 1.50 * quantidade;
        }
        else {
            System.out.println("O item não está no menu");
        }
        System.out.printf("O valor da conta foi de: R$ %.2f%n", valor);
        sc.close();
    }
}
