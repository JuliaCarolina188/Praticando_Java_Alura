package B_IfElse;

import java.util.Scanner;

public class Desconto {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o preço\n>");
        double preco = sc.nextDouble();
        sc.close();

        if (preco >= 100){
            preco *= 0.9;
            System.out.println("10% de desconto aplicado!");
        } else{
            System.out.println("Nenhum desconto aplicado.");
        }
        System.out.println("Preço atual: " + preco);
    }
}
