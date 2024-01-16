package aula13;

public class operadoresAritmeticos {
    public static void main(String[] args) {
        int resultado = 1 + 2;
        System.out.println(resultado);

        resultado = resultado - 1;
        System.out.println(resultado);

        resultado = resultado * 2;
        System.out.println(resultado);

        resultado = resultado / 2;
        System.out.println(resultado);

        resultado = resultado + 8;
        System.out.println(resultado);

        resultado = resultado % 7;
        System.out.println(resultado);

        String primeiroNome = "Esta é";
        String segundoNome = " uma string concatenada";
        String terceiroNome = primeiroNome + segundoNome;
        System.out.println(terceiroNome);

        resultado = resultado + 1;
        System.out.println(resultado);

        resultado++;
        System.out.println(resultado);

        //5
        System.out.println(resultado++); //continua 5 porque vai imprimir primeiro
        System.out.println(++resultado); //dá 7 porque primeiro adicona o valor pra depois ter o output 

    }
}
