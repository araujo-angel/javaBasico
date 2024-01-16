package aula13Exercicios;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Digite o raio de um círculo: ");
            Double raio = scan.nextDouble();
            Double area = Math.PI * (raio * raio); // OU Math.pow(raio, 2)
            System.out.println("A área é: " + area);
        }
    }
}
