package C_Repetição;

import java.util.Scanner;

public class Fatorial {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor da Fatorial\n>");
        int fat = sc.nextInt();

        for(int i = fat - 1; i >= 1; i--){
            fat *= i;
        }

        System.out.println("Fatorial: " + fat);
    }
}
