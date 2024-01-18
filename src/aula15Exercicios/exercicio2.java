package aula15Exercicios;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Digite um número:");
            Double n = scan.nextDouble();;
            if (n >= 0) {
                System.out.println(n  + " é positivo.");
            } else {
                System.out.println(n  + " é negativo.");
            }
        }
    }
}

