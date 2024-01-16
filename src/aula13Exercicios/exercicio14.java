package aula13Exercicios;

import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Digite o do arquivo em MB: ");
            Double tamArquivo = scan.nextDouble();

            System.out.println("Digite a velocidade da internet em Mbps: ");
            Double velInternet = scan.nextDouble();

            Double tempoDownload = tamArquivo / velInternet;
            System.out.println("O tempo de download é: " + tempoDownload);
        }
    }
}

