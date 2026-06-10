package A_Variaveis;

import java.util.Scanner;

public class dollares {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a quantia de reais\n>");
        double reais = input.nextDouble();
        System.out.println("Valor em dólares: " + (reais / 5.25));
    }
}
