package C_Repetição;

import java.util.Scanner;

public class Senha {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int senha = 12345;
        int tentativa = 0;
        int numeroDeTentativas = 3;
        boolean acesso = false;

        for(int i = 1; i <= numeroDeTentativas; i++) {
            System.out.print("Digite sua senha\n>");
            tentativa = sc.nextInt();

            if(tentativa == senha) {
                System.out.println("Senha correta! acesso concedido");
                acesso = true;
                break;
            } else {
                System.out.println("Senha incorreta! " + (numeroDeTentativas - i) + " tentativas restantes");
            }
        }
        if(!acesso) {
            System.out.println("Acesso negado.");
        }
    }
}
