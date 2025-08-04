package EstruturaCondicional_03.ExerciciosFixacao;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int horaInicial, horaFinal, duracao;

        System.out.println("Digite a hora inicial e final do jogo");
        horaInicial = sc.nextInt();
        horaFinal = sc.nextInt();

        if (horaFinal > horaInicial) {
            duracao = horaFinal - horaInicial;
        }
        else {
            duracao = 24 - horaInicial + horaFinal;
        }
        System.out.println("A duração do jogo foi de " + duracao + " horas");
        sc.close();
    }
}
