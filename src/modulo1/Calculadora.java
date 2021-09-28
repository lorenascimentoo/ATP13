package modulo1;

import java.util.Scanner;

public class Calculadora {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        cabecalho();
        int resultado1 = lerSoma();
        int resultado2 = lerSoma();
        int resultado3 = lerSoma();
        int resultado4 = lerSoma();
        System.out.printf("%d %d %d %d\n", resultado1, resultado2, resultado3, resultado4);
        
        double media = media(resultado1, resultado2, resultado3, resultado4);
    }
    static void cabecalho(){
        System.out.println("========= CALCULO DE MEDIA =========");
    }
    static int soma(int n1, int n2){
        int resultado = n1 + n2; 
        System.out.println(resultado);
        return resultado; 
    }
    static double media(int n1, int n2, int n3, int n4){
        double resultMedia = (n1+n2+n3+n4)/4;
        System.out.println(resultMedia);
        return resultMedia;
    }
    static int lerValor (String mensagem){
        System.out.println(mensagem);
        int valor = Integer.parseInt(scan.nextLine());
        return valor;
    }
    static int lerSoma (){
    int n1 = lerValor ("Digite o primeiro valor de soma: ");
    int n2 = lerValor ("Digite o segundo valor de soma: ");
    return soma (n1, n2); 
    }
}