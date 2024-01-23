package aula17Exercicios;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)) {
            boolean notaValida = false;

            do {
                System.out.println("Digite uma nota entre zero e dez: ");
                Double nota = scan.nextDouble();
                if (nota >=0 && nota <= 10) {
                    notaValida = true;
                    System.out.println("A nota enviada foi: " + nota);
                } else {
                    System.out.println("Nota inválida, digite novamente!");
                }
            } while (!notaValida);
        }        
    }
}
