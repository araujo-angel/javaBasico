package aula15Exercicios;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Digite 'F' ou 'M':");
            String input = scan.next();
            if (input.equalsIgnoreCase("f")) {
                System.out.println(input  + " - Feminino.");
            } else if (input.equalsIgnoreCase("m")) {
                System.out.println(input  + " - Maculino.");
            } else {
                System.out.println("input inválido.");
            }
        }
    }
}
