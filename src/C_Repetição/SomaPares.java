package C_Repetição;

public class SomaPares {
    static void main() {
        int soma = 0;
        for (int i = 0; i <= 100; i += 2) {
            soma += i;
        }
        System.out.println("Soma total: " + soma);
    }
}
