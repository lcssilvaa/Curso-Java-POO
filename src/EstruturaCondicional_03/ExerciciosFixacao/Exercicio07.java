package EstruturaCondicional_03.ExerciciosFixacao;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double coordX, coordY;

        System.out.println("Digite as coordenadas do eixo X e Y:");
        System.out.println("Eixo X:");
        coordX = sc.nextDouble();
        System.out.println("Eixo Y:");
        coordY = sc.nextDouble();

        if (coordX == 0 && coordY == 0) {
            System.out.println("A coordenada está na origem");
        }
        else if (coordX > 0 && coordY > 0) {
            System.out.println("A coordenada " + coordX + ", " + coordY + " está no quadrante 1");
        }
        else if (coordX < 0 && coordY > 0) {
            System.out.println("A coordenada " + coordX + ", " + coordY + " está no quadrante 2");
        }
        else if (coordX < 0 && coordY < 0) {
            System.out.println("A coordenada " + coordX + ", " + coordY + " está no quadrante 3");
        }
        else if (coordX > 0 && coordY < 0) {
            System.out.println("A coordenada " + coordX + ", " + coordY + " está no quadrante 4");
        }
        sc.close();
    }
}
