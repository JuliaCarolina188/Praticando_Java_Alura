package B_IfElse;

import java.util.Scanner;

public class MaiorOuMenor {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero\n>");
        int n1 =  sc.nextInt();
        System.out.print("Digite outro numero\n>");
        int n2 =  sc.nextInt();

        if(n1>n2){
            System.out.println("Maior: " + n1);
        } else {
            System.out.println("Maior: " + n2);
        }
    }
}
