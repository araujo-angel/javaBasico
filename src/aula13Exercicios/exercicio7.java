package aula13Exercicios;

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Digite o valor da base e altura do quadrado: ");
            Double lado = scan.nextDouble();
            Double area = (lado * lado); // OU Math.pow(lado,2);
            System.out.println("O dobro da área é: " + area * 2);
        }
    }
}
