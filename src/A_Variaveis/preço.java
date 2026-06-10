package A_Variaveis;

import java.util.Scanner;

public class preço {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o preço\n>");
        double preco = input.nextDouble();
        String categoria = "";

        if (preco <= 0){
            categoria = "Sem preço definido";
        } else if(preco <= 50){
            categoria = "Econômica";
        } else if (preco <= 200){
            categoria = "Intermediário";
        } else if (preco > 200){
            categoria = "Premium";
        }

        System.out.println("Categoria do produto: " + categoria);
    }
}
