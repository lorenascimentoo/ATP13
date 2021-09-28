package modulo1;

public class atp14 {
    public static void main(String[]args){
        cabecalho();

        exibeMenu();
    }
    static void cabecalho(){
        System.out.println("********Calculadora********");
    }

    static void exibeMenu(){
        System.out.println("** Opções da calculadora **");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
    }
}
