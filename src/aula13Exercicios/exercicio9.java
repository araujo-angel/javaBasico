package aula13Exercicios;

import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Digite a temperatura em Farenheit: ");
            Double tempF = scan.nextDouble();
            Double tempC = (5 * (tempF - 32) / 9);
            System.out.println(tempF + " Farenheit em Celsius é: " + tempC);
        }
    }
}
