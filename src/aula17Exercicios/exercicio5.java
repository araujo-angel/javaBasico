package aula17Exercicios;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)) {
            double popA;
            double popB;
            double taxaA;
            double taxaB;
            boolean valido = false;
            do {
                System.out.println("Digite a população A: ");
                popA  = scan.nextDouble();
                if (popA > 0) {
                    valido = true;
                } else {
                    System.out.println("População precisa ser maior que 0.");
                }
            } while (!valido);

            valido = false;
            do {
                System.out.println("Digite a taxa de crescimento da população A: ");
                taxaA  = scan.nextDouble();
                if (taxaA > 0) {
                    valido = true;
                } else {
                    System.out.println("A taxa de crescimento da população deve ser maior que 0.");
                }
            } while (!valido);

            valido = false;    
            do {
                System.out.println("Digite a população B: ");
                popB  = scan.nextDouble();
                if (popB > 0) {
                    valido = true;
                } else {
                    System.out.println("População precisa ser maior que 0.");
                }
            } while (!valido);

            valido = false;
            do {
                System.out.println("Digite a taxa de crescimento da população B: ");
                taxaB  = scan.nextDouble();
                if (taxaB > 0) {
                    valido = true;
                } else {
                    System.out.println("A taxa de crescimento da população deve ser maior que 0.");
                }
            } while (!valido);
            int count = 0;
            
            while (popA < popB) {
                popA += (popA/100) * taxaA;
                popB += (popB/100) * taxaB;
                count ++;
            }

            System.out.println("População A: " + popA + ". População B: " + popB + ". Qtd de anos: " + count);
        }
    }
}
