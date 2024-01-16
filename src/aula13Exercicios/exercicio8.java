package aula13Exercicios;

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Digite o valor da sua hora de trabalho: ");
            Double precoHora = scan.nextDouble();
            System.out.println("Digite o total de horas de trabalho por mês: ");
            Double totalHoras = scan.nextDouble();
            Double salario = precoHora * totalHoras;
            System.out.println("O seu salário é: " + salario + " R$");
        }
    }
}