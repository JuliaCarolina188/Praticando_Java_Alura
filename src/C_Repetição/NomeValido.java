package C_Repetição;

import java.util.Scanner;

public class NomeValido {
    static void main() {
        Scanner sc = new Scanner(System.in);
        boolean nomeValido = false;
        do {
            System.out.print("Digite seu nome\n>");
            String nome = sc.nextLine();
            if(nome.length() >= 3) {
                System.out.println("Nome válido");
                nomeValido = true;
            }else{
                System.out.println("Nome inválido. Pelo menos 3 caracteres.");
            }
        }while(!nomeValido);
    }
}
