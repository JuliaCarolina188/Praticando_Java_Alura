package C_Repetição;

import java.util.Scanner;

public class Maior {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite numeros separados por espaços\n>");
        String[] lista = sc.nextLine().split(" ");
        int maior = 0;
        int n;
        for(int i = 0; i < lista.length; i++){
            n = Integer.parseInt(lista[i]);
            if(i == 0){
                maior = n;
            }else if (n > maior){
                maior = n;
            }
        }

        System.out.println("Maior: " + maior);
    }
}
