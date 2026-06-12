package B_IfElse;

import java.util.Scanner;

public class Triangulo {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os tamanhos dos 3 lados de um triangulo");
        System.out.print(">");
        double l1 = sc.nextDouble();
        System.out.print(">");
        double l2 = sc.nextDouble();
        System.out.print(">");
        double l3 = sc.nextDouble();
        sc.close();

        if (l1 + l2 > l3 && l1 + l3 > l2 && l2 + l3 > l1){
            System.out.println("É possível formar um triangulo");
        } else if (l1 == l2 && l1 == l3){
            System.out.println("É possível formar um triangulo de lados iguais");
        } else {
            System.out.println("Não é possível formar um triangulo");
        }
    }
}
