package B_IfElse;

import java.util.Scanner;

public class CodigoDeAcesso {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o codigo de acesso\n>");
        int codigo = sc.nextInt();
        boolean acessoCodigo = false;
        if (codigo == 2023) {
            acessoCodigo = true;
        }
        System.out.print("Digite seu nivel de permissão\n>");
        int nivel = sc.nextInt();
        boolean acessoNivel = false;
        if (nivel == 1 || nivel == 2 || nivel == 3) {
            acessoNivel = true;
        }

        if (acessoNivel && acessoCodigo) {
            System.out.println("Credenciais corretas. Bem vindo");
        } else if (acessoNivel && !acessoCodigo) {
            System.out.println("Credenciais incorretas. Codigo negado");
        } else if (!acessoNivel && acessoCodigo) {
            System.out.println("Credenciais incorretas. Nivel de acesso incorreto");
        } else {
            System.out.println("Acesso negado");
        }
    }
}
