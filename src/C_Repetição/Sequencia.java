package C_Repetição;

import java.util.Scanner;

public class Sequencia {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero\n>");
        int numero = sc.nextInt();

        for(int i = 1; i <= numero; i++) {
            if(i % 10 != 5){
                System.out.print(i + " ");
            }
        }
    }
}
