package C_Repetição;

import java.util.ArrayList;
import java.util.Scanner;

public class Convidados {
    static void main() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> convidados = new ArrayList<>();
        String palavra;
        System.out.println("Adicione o nome do convidado, \"ver\" par ver a lista atual, \"sair\" para encerrar a lista");

        while(true){
            System.out.print(">");
            palavra = sc.nextLine();

            if(palavra.equalsIgnoreCase("ver")){
                System.out.print(convidados);
            }else if(palavra.equalsIgnoreCase("sair")){
                break;
            }else{
                convidados.add(palavra);
            }
        }

        sc.close();
        System.out.println("Lista de convidados:");
        for(String convidado : convidados){
            System.out.println(convidado + ", ");
        }
    }
}
