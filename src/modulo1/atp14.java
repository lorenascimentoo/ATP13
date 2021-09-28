package modulo1;

import java.util.Scanner;

public class atp14 {
    public static void main(String[]args){
        cabecalho();

        exibirMenu();
        int opcao = lerOpcao("Digite uma opção para cálculo: ");
    }
    static void cabecalho(){
        System.out.println("********Calculadora********");
    }

    static void exibirMenu(){
        System.out.println("** Opções da calculadora **");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
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
}
