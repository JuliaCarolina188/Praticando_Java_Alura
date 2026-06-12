package C_Repetição;

public class Soma {
    static void main() {
        int soma = 0;
        int[] valores = {10, 20, 30, 40, 50};
        for (int valor : valores) {
            soma += valor;
        }
        System.out.println("A soma total é de " + soma);
    }
}
