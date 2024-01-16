package aula13Exercicios;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Digite a temperatura em Celsius: ");
            Double tempC = scan.nextDouble();
            Double tempF = (tempC * 1.8) + 32;
            System.out.println(tempC + " Celsius em  Farenheit é: " + tempF);
        }
    }
}

