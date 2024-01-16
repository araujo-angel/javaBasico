package aula13Exercicios;

import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Digite sua altura: ");
            Double altura = scan.nextDouble();
            Double pesoIdeal = (72.7 * altura ) - 58;
            System.out.println("O peso ideal para a altura " + altura + " é: " + pesoIdeal);
        }
    }
}
