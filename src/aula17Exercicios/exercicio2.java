package aula17Exercicios;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)) {
            boolean infoValidas = false;
            String nomeUsuario;
            String senha;

            while (!infoValidas) {
                System.out.println("Digite um nome: ");
                nomeUsuario = scan.next();
                System.out.println("Digite uma senha: ");
                senha = scan.next();

                if (nomeUsuario.equalsIgnoreCase(senha)){
                    infoValidas = false;
                    System.out.println("Senha inválida, digite novamente!");
                } else {
                    infoValidas = true;
                    System.out.println("Usuário cadastrado com sucesso!");
                }
            }
        }
    }
}
