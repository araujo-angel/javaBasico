package aula15Exercicios;

import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Digite o valor da sua hora de trabalho: ");
            Double precoHora = scan.nextDouble();
            System.out.println("Digite o total de horas de trabalho por mês: ");
            Double totalHoras = scan.nextDouble();

            Double salarioBruto = precoHora * totalHoras;
            Double inss = (salarioBruto / 100) * 10;
            Double fgts = (salarioBruto /100) * 11;
            Double sindicato = (salarioBruto / 100) * 5;
        
            if (salarioBruto <= 900.00) {
                Double totalDescontos = inss + sindicato;
                Double salarioLiquido = salarioBruto - totalDescontos;
    
                System.out.println("O salário bruto é: " + salarioBruto + " R$");
                System.out.println("Imposto de renda: ISENTO");
                System.out.println("INSS: " + inss);
                System.out.println("FGTS: " + fgts);
                System.out.println("Descontos: " + totalDescontos);
                System.out.println("Salário liquido: " + salarioLiquido);

            } else if (salarioBruto <= 1500.00) {
                Double ir = (salarioBruto / 100) * 5;
                Double totalDescontos = inss + sindicato;
                Double salarioLiquido = salarioBruto - totalDescontos;
    
                System.out.println("O salário bruto é: " + salarioBruto + " R$");
                System.out.println("Imposto de renda: " + ir);
                System.out.println("INSS: " + inss);
                System.out.println("FGTS: " + fgts);
                System.out.println("Descontos: " + totalDescontos);
                System.out.println("Salário liquido: " + salarioLiquido);

            } else if (salarioBruto <= 2500.00) {
                Double ir = (salarioBruto / 100) * 10;
                Double totalDescontos = inss + sindicato;
                Double salarioLiquido = salarioBruto - totalDescontos;
    
                System.out.println("O salário bruto é: " + salarioBruto + " R$");
                System.out.println("Imposto de renda: " + ir);
                System.out.println("INSS: " + inss);
                System.out.println("FGTS: " + fgts);
                System.out.println("Descontos: " + totalDescontos);
                System.out.println("Salário liquido: " + salarioLiquido);

            } else if (salarioBruto >= 2500.00) {
                Double ir = (salarioBruto / 100) * 20;
                Double totalDescontos = inss + sindicato;
                Double salarioLiquido = salarioBruto - totalDescontos;
    
                System.out.println("O salário bruto é: " + salarioBruto + " R$");
                System.out.println("Imposto de renda: " + ir);
                System.out.println("INSS: " + inss);
                System.out.println("FGTS: " + fgts);
                System.out.println("Descontos: " + totalDescontos);
                System.out.println("Salário liquido: " + salarioLiquido);
            }
        }
    }
}