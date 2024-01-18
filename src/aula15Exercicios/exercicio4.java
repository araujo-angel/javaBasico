package aula15Exercicios;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Digite uma letra:");
            String letra = scan.next();

           /* if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
                System.out.println("vogal.");
            } else {
                System.out.println("consoante.");
            }*/
            if (letra.length() > 1){
                System.out.println("Não é uma opção válida");
                } else {
                    switch(letra) {
                        case "a":
                        case "e":
                        case "i":
                        case "o":
                        case "u":
                        case "A":
                        case "E":
                        case "I":
                        case "O":
                        case "U": System.out.println("vogal."); break;
                        default: System.out.println("consoante.");
                    }
                }            
        }
    }
}

