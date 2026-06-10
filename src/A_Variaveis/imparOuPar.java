package A_Variaveis;

import java.util.Scanner;

public class imparOuPar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero\n>");
        int numero = input.nextInt();
        if(numero % 2 == 0){
            System.out.println("Numero par");
        } else {
            System.out.println("Numero impar");
        }
    }
}
