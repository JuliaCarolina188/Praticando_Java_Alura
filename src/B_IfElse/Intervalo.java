package B_IfElse;

import java.util.Scanner;

public class Intervalo {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero\n>");
        int n =  sc.nextInt();

        if(n >= 100 && n <= 200) {
            System.out.println("Numero dentro do intervalo permitido (100 - 200)");
        } else {
            System.out.println("Numero fora do intervalo permitido.");
        }
    }
}
