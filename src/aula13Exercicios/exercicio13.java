package aula13Exercicios;

import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Digite o valor da sua hora de trabalho: ");
            Double precoHora = scan.nextDouble();
            System.out.println("Digite o total de horas de trabalho por mês: ");
            Double totalHoras = scan.nextDouble();
            Double salarioBruto = precoHora * totalHoras;
            Double inss = (salarioBruto / 100) * 8;
            Double sindicato = (salarioBruto / 100) * 5;
            Double ir = (salarioBruto / 100) * 11;
            Double totalDescontos = inss + sindicato + ir;
            Double salarioLiquido = salarioBruto - totalDescontos ;

            System.out.println("O salário bruto é: " + salarioBruto + " R$");
            System.out.println("INSS: " + inss);
            System.out.println("Sindicato: " + sindicato);
            System.out.println("Imposto de renda: " + ir);
            System.out.println("Descontos: " + totalDescontos);
            System.out.println("Salário liquido: " + salarioLiquido);
        }
    }
}