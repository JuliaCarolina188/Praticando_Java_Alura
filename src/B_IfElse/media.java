package B_IfElse;

import java.util.Scanner;

public class media {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a media\n>");
        String situacao;
        double media = input.nextDouble();
        if(media < 5){
            situacao = "reprovado";
        } else if (media < 7) {
            situacao = "recuperação";
        } else {
            situacao = "aprovado";
        }
        System.out.println("Situação: " + situacao);
    }
}
