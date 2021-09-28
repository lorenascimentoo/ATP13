package modulo1;

public class Calculadora {

    public static void main(String[] args) {
        cabecalho();
        soma(10, 20);
        media(10,8, 7, 10);
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
}