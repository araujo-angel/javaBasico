package aula15Exercicios;

import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)) {
            System.out.println("Digite seu salário: ");
            Double salario = scan.nextDouble();
            if (salario <= 280.00) {
                int percVinte = 20;
                Double aumento = (salario * percVinte) / 100;
                Double novoSalario = salario + aumento;
                System.out.println("Salário antigo: " + salario + ". Percentual de aumento: " + percVinte + "%" + ". Valor do aumento: " + aumento + ". Salário atual: " + novoSalario + ".");
            } else if (salario >= 280.00 && salario <= 700.00) {
                int percQuinze = 15;
                Double aumento = (salario * percQuinze) / 100;
                Double novoSalario = salario + aumento;
                System.out.println("Salário antigo: " + salario + ". Percentual de aumento: " + percQuinze + "%" + ". Valor do aumento: " + aumento + ". Salário atual: " + novoSalario + "."); 
            } else if (salario >= 700.00 && salario <= 1500.00) {
                int percDez = 10;
                Double aumento = (salario * percDez) / 100;
                Double novoSalario = salario + aumento;
                System.out.println("Salário antigo: " + salario + ". Percentual de aumento: " + percDez + "%" + ". Valor do aumento: " + aumento + ". Salário atual: " + novoSalario + "."); 
            } else if (salario >= 1500.00) {
                int perCinco = 5;
                Double aumento = (salario * perCinco) / 100;
                Double novoSalario = salario + aumento;
                System.out.println("Salário antigo: " + salario + ". Percentual de aumento: " + perCinco + "%" + ". Valor do aumento: " + aumento + ". Salário atual: " + novoSalario + ".");
            }
        }
    }
}
