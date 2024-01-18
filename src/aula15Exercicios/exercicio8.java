package aula15Exercicios;

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Digite um número:");
            Double prod1 = scan.nextDouble();
            System.out.println("Digite um número:");
            Double prod2 = scan.nextDouble();
            System.out.println("Digite um número:");
            Double prod3 = scan.nextDouble();

            if (prod1 < prod2 && prod1 < prod3) {
                System.out.println(prod1 + " é a melhor escolha");
            } else if (prod2 < prod1 && prod2 < prod3) {
                System.out.println(prod2 + " é a melhor escolha");
            } else if (prod3 < prod1 && prod3 < prod2){
                System.out.println(prod3 + " é a melhor escolha");
            }
        }
    }
}
