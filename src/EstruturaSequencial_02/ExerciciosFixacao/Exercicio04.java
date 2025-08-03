package EstruturaSequencial_02.ExerciciosFixacao;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int horasTrabalhadas, numeroFuncionario;
        double valorHora;

        System.out.println("Número do funcionário:");
        numeroFuncionario = sc.nextInt();

        System.out.println("Horas trabalhadas:");
        horasTrabalhadas = sc.nextInt();

        System.out.println("Valor por hora trabalhada:");
        valorHora = sc.nextDouble();

        double salario = valorHora * horasTrabalhadas;

        System.out.println("O salário do funcionário: " + numeroFuncionario + " é igual a: " + salario);
        sc.close();
    }
}
