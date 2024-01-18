package aula15Exercicios;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Digite a primeira nota:");
            Double nota1 = scan.nextDouble();
            System.out.println("Digite a segunda nota:");
            Double nota2 = scan.nextDouble();
            Double media = (nota1 + nota2) / 2;

            if (media == 10.0) {
                System.out.println("Aprovado(a)! com distinção!!");
            } else if (media >= 7.0) {
                System.out.println("Aprovado(a)!");
            } else {
                System.out.println("Reprovado(a)!");
            }
        }
    }
}