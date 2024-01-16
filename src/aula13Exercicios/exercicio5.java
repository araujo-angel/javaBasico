package aula13Exercicios;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Digite a medida em metros: ");
            Double metro = scan.nextDouble();
            Double cm = (metro * 100);

            System.out.println(metro + " metro(s) equivale a " + cm + " centimetros.");
        }
    }
}
