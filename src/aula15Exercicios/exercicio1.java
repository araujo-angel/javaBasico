package aula15Exercicios;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Digite um número:");
            Double num1 = scan.nextDouble();
            System.out.println("Digite outro número:");
            Double num2 = scan.nextDouble();
            if (num1 > num2) {
                System.out.println(num1 + " é maior que " + num2);
            } else if (num2 > num1) {
                System.out.println(num2 + " é maior que " + num1);
            } else {
                System.out.println(num1 + " e " + num2 + " são iguais");
            }
        }
    }
}
