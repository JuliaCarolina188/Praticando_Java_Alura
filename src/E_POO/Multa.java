package E_POO;

public class Multa {
    String titulo;
    int diasDeAtraso;

    static void main() {
        Multa guerra = new Multa();
        guerra.titulo = "A arte da guerra";
        guerra.diasDeAtraso = 3;

        System.out.println("Multa até agora: " + guerra.valorDaMulta());
        guerra.info();
    }

    double valorDaMulta(){
        return diasDeAtraso * 2.5;
    }

    void info(){
        System.out.printf("\nLivro: " + titulo + " | Multa por " + diasDeAtraso + " dias de atraso: R$ %.2f\n", valorDaMulta());
    }

}
