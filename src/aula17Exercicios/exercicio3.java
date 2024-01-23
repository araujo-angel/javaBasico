package aula17Exercicios;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)) {
            boolean infoValida = false;
            String nome;
            int idade;
            Double salario;
            String sexo;
            String estadoCivil;


            do {
                System.out.println("Digite seu nome: ");
                nome = scan.next();
                if (nome.length() > 3) {
                    infoValida = true;
                } else {
                    System.out.println("Nome necessita de no mínimo 3 caracteres.");
                }
            } while (!infoValida);

            infoValida = false;
            do {
                System.out.println("Digite sua idade: ");
                idade = scan.nextInt();
                if (idade >= 0 && idade < 150) {
                    infoValida = true;
                } else {
                    System.out.println("Idade necessita estar entre 0 e 150.");
                }
            } while (!infoValida);
            
            infoValida = false;
            do {
                System.out.println("Digite seu salário: ");
                salario = scan.nextDouble();
                if (salario > 0) {
                    infoValida = true;
                } else {
                    System.out.println("Salário necessita ser maior que 0.");
                }
            } while (!infoValida);

            infoValida = false;
            do {
                System.out.println("Digite seu sexo ('f' ou 'm'): ");
                sexo = scan.next();
                if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
                    infoValida = true;
                } else {
                    System.out.println("Sexo inválido.");
                }
            } while (!infoValida);

            infoValida = false;
            do {
                System.out.println("Digite estado civil ('s' solteiro/a, 'c' casado/a, 'v' viuvo/a e 'd' divorciado/a): ");
                estadoCivil = scan.next();
                if (estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c") || estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d")) {
                    infoValida = true;
                } else {
                    System.out.println("Estado civil inválido.");
                }
            } while (!infoValida);
           
            System.out.println("As seguintes informações foram coletadas: ");
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Salário: " + salario);
            System.out.println("Sexo: " + sexo);
            System.out.println("Estado civil: " + estadoCivil);
        }
    }
}
