package modulo1;

import java.util.Scanner;

public class atp14 {
    public static void main(String[]args){
        cabecalho();

        exibirMenu();
        int opcao = lerOpcao("Digite uma opção para cálculo: ");

        selecionarMenu(opcao);
    }

    static void cabecalho(){
        System.out.println("********Calculadora********");
    }

    static void exibirMenu(){
        System.out.println("** Opções da calculadora **");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
    }

    static int lerOpcao(String mensagem){
        Scanner scan = new Scanner(System.in);
        int numero;
        do{
            System.out.print(mensagem);
            numero = Integer.parseInt(scan.nextLine());
        }while (!validarOpcao(numero));
        return numero;
    }
    static boolean validarOpcao(int numero){
        boolean validacao = true;
        if (numero <= 0 || numero > 4){
            System.out.println("Opção Inválida");
            validacao = false;
        } 
        return validacao;
    }

    static void selecionarMenu(int op){
        switch (op) {
            case 1:
                System.out.println("==== SOMA ===");
                somar();
                break;
            case 2:
                System.out.println("==== SUBTRAÇÃO ===");
                subtrair();
                break;
            case 3:
                System.out.println("==== MULTIPLICAÇÃO ===");
                multiplicar();
                break;
            case 4:
                System.out.println("==== DIVISÃO ===");
                dividir();
                break;
        }
    }

    static void somar(){

    }

    static void subtrair(){
        
    }

    static void multiplicar(){
        
    }

    static void dividir(){
        
    }
}
