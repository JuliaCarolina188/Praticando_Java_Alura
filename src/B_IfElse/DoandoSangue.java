package B_IfElse;

import java.util.Scanner;

public class DoandoSangue {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua idade\n>");
        int idade = sc.nextInt();
        System.out.print("Digite seu peso\n>");
        double peso = sc.nextDouble();

        if (idade >= 18 && idade <= 65){
            if (peso >= 55){
                System.out.println("Doador comátivel");
            } else {
                System.out.println("Doador não compativel. Peso menor do que o requerido (55)");
            }
        } else {
            System.out.println("Doador não compativel. Fora da idade permitida (18 - 65)");
        }
    }
}
