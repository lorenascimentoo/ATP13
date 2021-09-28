package modulo1;

import java.util.Scanner;

public class atp14 {
    static Scanner scan;
    public static void main(String[]args){
        // exibicao do cabecalho
        cabecalho();
        // exibe as opcoes de calculo
        exibirMenu();
        // solicita ao usuario uma opcao do menu
        int opcao = lerOpcao("Digite uma opção para cálculo: ");
        // apos a leitura da opcao, chama o metodo que direciona o calculo de acordo com a opcao inserida
        selecionarMenu(opcao);
    }

    // metodo que imprime a mensagem do cabecalho
    static void cabecalho(){
        System.out.println("********Calculadora********");
    }
    // metodo que imprime as opcoes do menu
    static void exibirMenu(){
        System.out.println("** Opções da calculadora **");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
    }
    // metodo que retorna um numero valida inserida pelo usuario
    static double lerNumero(String mensagem){
        scan = new Scanner(System.in);
        System.out.print(mensagem);
        double numero = Double.parseDouble(scan.nextLine()); 
        return numero;
    }
    // metodo que retorna a opcao valida inserida pelo usuario
    static int lerOpcao(String mensagem){
        scan = new Scanner(System.in);
        int numero;
        do{
            System.out.print(mensagem);
            numero = Integer.parseInt(scan.nextLine());
        }while (!validarOpcao(numero));
        return numero;
    }
    //metodo que valida a opcao dada pelo usuario
    static boolean validarOpcao(int numero){
        boolean validacao = true;
        if (numero <= 0 || numero > 4){
            System.out.println("Opção Inválida");
            validacao = false;
        } 
        return validacao;
    }

    // metodo que executa o calculo de acordo com a opcao inserida pelo usuario
    static void selecionarMenu(int op){
        // solicita ao usuario que digite os numeros para realizacao do calculo
        double n1 = lerNumero("Digite o primeiro número: ");
        double n2 = lerNumero("Digite o segundo número: ");

        double resultado=0.0;
        switch (op) {
            case 1:
                System.out.println("==== SOMA ===");
                resultado = somar(n1, n2);
                break;
            case 2:
                System.out.println("==== SUBTRAÇÃO ===");
                resultado = subtrair(n1, n2);
                break;
            case 3:
                System.out.println("==== MULTIPLICAÇÃO ===");
                resultado = multiplicar(n1, n2);
                break;
            case 4:
                System.out.println("==== DIVISÃO ===");
                resultado = dividir(n1, n2);
                break;
        }

        System.out.printf("O resultado do calculo é: %.2f", resultado);
    }

    static double somar(double n1, double n2){
        double soma = n1 + n2;
        return soma;
    }

    static double subtrair(double n1, double n2){
        double subtracao = n1 - n2;
        return subtracao;
    }

    static double multiplicar(double n1, double n2){
        double multiplicacao = n1 * n2;
        return multiplicacao;  
    }

    static double dividir(double n1, double n2){
        double divisao = n1 / n2;
        return divisao;  
    }
}
