package B_IfElse;

import java.util.Scanner;

public class senha {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String senha = "123456";
        System.out.print("Digite a senha\n>");
        String tentativa = sc.nextLine();
        sc.close();
        if(tentativa.equals(senha)){
            System.out.println("Senha correta!");
        } else {
            System.out.println("Senha incorreta!");
        }
    }
}
