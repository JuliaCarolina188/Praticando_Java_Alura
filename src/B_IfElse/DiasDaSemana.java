package B_IfElse;

import java.util.Scanner;

public class DiasDaSemana {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um dia da semana\n>");
        String dia = sc.nextLine().toLowerCase();

        if(dia.equals("segunda") || dia.equals("terça") || dia.equals("quarta") || dia.equals("quinta") || dia.equals("sexta")){
            System.out.println("Dia util");
        } else if (dia.equals("sabado") || dia.equals("domingo")){
            System.out.println("Fim de semana");
        } else {
            System.out.println("Dia não identificado");
        }
    }
}
