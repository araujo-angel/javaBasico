package aula13Exercicios;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
        System.out.println("Digite um número inteiro:");
        int numero1 = scan.nextInt();
        System.out.println("Digite outro número inteiro:");
        int numero2 = scan.nextInt();
        System.out.println("A soma dos números informados resultou em: " + (numero1 + numero2));
       }
    }
}
