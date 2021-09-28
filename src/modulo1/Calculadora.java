package modulo1;

public class Calculadora {

    public static void main(String[] args) {
        cabecalho();
        soma(10, 20);
    }

    static void cabecalho(){
        System.out.println("========= CALCULO DE MEDIA =========");
    }
    static int soma(int n1, int n2){
        int resultado = n1 + n2; 
        System.out.print(resultado);
        return resultado; 
    }
}