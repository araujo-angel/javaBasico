package aula15Exercicios;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)) {
            System.out.println("Digite o turmo em que você estuda (M - MATUTINO, V - VESPERTINO, N - NOITE)");
            String turno = scan.next();
            if (turno.equalsIgnoreCase("m")) {
                System.out.println("Bom dia!");
            } else if (turno.equalsIgnoreCase("v")) {
                System.out.println("Boa tarde!");
            } else if (turno.equalsIgnoreCase("n")) {
                System.out.println("Boa noite!");
            } else {
                System.out.println("Valor inválido!");
            }
        }
    }
}
