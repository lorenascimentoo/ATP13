package modulo1;

import java.util.Scanner;

public class Calculadora {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        //exibicao do cabecalho
        cabecalho();

        // Chamada do método de soma por 4 vezes
        // foi criado o metodo lerSoma(), esse método ele solicita dois valores, realiza a soma e retorna essa soma
        int resultado1 = lerSoma();
        int resultado2 = lerSoma();
        int resultado3 = lerSoma();
        int resultado4 = lerSoma();
        
        // Com valores de resultado de soma calculados, chama o metodo que calcula a media e recebe o valor na variavel media
        double media = media(resultado1, resultado2, resultado3, resultado4);

        // exibe os valores utilizados no calculo da media e a media
        System.out.printf("O cálculo da média entre os valores %d, %d, %d e %d é: %.2f", resultado1, resultado2, resultado3, resultado4,media);
    }
    // metodo que imprime o cabecalho
    static void cabecalho(){
        System.out.println("========= CALCULO DE MEDIA =========");
    }
    // metodo que recebe dois valores, faz a soma e retorna o resultado da soma
    static int soma(int n1, int n2){
        int resultado = n1 + n2;
        return resultado; 
    }
    // metodo que recebe quatro valores, calcula a media e retorna o resultado da media
    static double media(int n1, int n2, int n3, int n4){
        double resultMedia = (n1+n2+n3+n4)/4;
        return resultMedia;
    }
    //metodo lerValor solicita ao usuario um valor atraves do terminal
    static int lerValor (String mensagem){
        System.out.println(mensagem);
        int valor = Integer.parseInt(scan.nextLine());
        return valor;
    }

    // metodo lerSoma(), esse método ele solicita dois valores, realiza a soma e retorna essa soma
    static int lerSoma (){
    int n1 = lerValor ("Digite o primeiro valor de soma: "); //Utiliza o metodo lerValor que solicita ao usuario um valor
    int n2 = lerValor ("Digite o segundo valor de soma: ");
    return soma (n1, n2); 
    }
}