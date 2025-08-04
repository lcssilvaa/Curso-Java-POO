package EstruturaCondicional_03.ExerciciosFixacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double valor;

        System.out.println("Escolha um valor:");
        valor = sc.nextDouble();

        if (valor >= 0 && valor <= 25) {
            System.out.println("O valor escolhido está entre 0 e 25");
        }
        else if (valor > 25 && valor <= 50) {
            System.out.println("O valor escolhido está entre 25 e 50");
        }
        else if (valor > 50 && valor <= 75) {
            System.out.println("O valor escolhido está entre 50 e 75");
        }
        else if (valor > 75 && valor <= 100) {
            System.out.println("O valor escolhido está entre 75 e 100");
        }
        else {
            System.out.println("Fora do intervalo");
        }
        sc.close();
    }
}
