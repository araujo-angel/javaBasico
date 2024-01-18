package aula15Exercicios;

import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Digite um número:");
            Double num1 = scan.nextDouble();
            System.out.println("Digite um número:");
            Double num2 = scan.nextDouble();
            System.out.println("Digite um número:");
            Double num3 = scan.nextDouble();

            if (num1 > num2 && num1 > num3 && num3 < num2) {
                System.out.println(num1 + "," + num2 + "," + num3);
            } else if (num2 > num1 && num2 > num3 && num3 > num1) {
                System.out.println(num2 + "," + num3 + "," + num1);
            } else if (num3 > num1 && num3 > num2 && num2 > num1){
                System.out.println(num3 + "," + num2 + "," + num1);
            } else if (num1 > num2 && num1 > num3 && num2 > num3){
                System.out.println(num1 + "," + num2 + "," + num3);
            }
        }
    }
}
