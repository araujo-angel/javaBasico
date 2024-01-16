package aula13Exercicios;

import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Digite um número inteiro: ");
            int n1 = scan.nextInt();
            System.out.println("Digite um número inteiro: ");
            int n2 = scan.nextInt();
            System.out.println("Digite um número real: ");
            Double n3 = scan.nextDouble();
            int resultado1 = (n1 * 2) * (n2 / 2);
            Double resultado2 = (n1 * 3) + n3;
            Double resultado3 = n3 * n3 * n3; // OU Math.pow(num3, 3);
            System.out.println("a: " + resultado1);
            System.out.println("b: " + resultado2);
            System.out.println("c: " + resultado3);
        }
    }
}
