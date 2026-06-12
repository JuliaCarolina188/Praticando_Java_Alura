package C_Repetição;

import java.util.Scanner;

public class Degraus {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de degraus\n>");
        int degraus = sc.nextInt();

        for (int i = 1; i <= degraus; i++) {
            System.out.println("Subindo degrau " + i);
        }
        System.out.println("Você chegou ao topo!");
    }
}
