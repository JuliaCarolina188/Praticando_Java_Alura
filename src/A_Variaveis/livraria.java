package A_Variaveis;

import java.util.Scanner;

public class livraria {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o título\n>");
        String titulo = input.nextLine();

        System.out.print("Digite o nome do autor\n>");
        String autor = input.nextLine();

        System.out.print("Digite o numero de páginas\n>");
        int paginas = input.nextInt();

        System.out.print("Digite o preço\n>");
        double preco  = input.nextDouble();

        System.out.print("""
                Digite a categoria:
                F - Ficção
                N - Não ficção
                T - Tecnologia
                H - HIstória
                >""");
        char cat = Character.toUpperCase(input.next().charAt(0));
        String categoria = "";
        switch (cat){
            case 'F':
                categoria = "Ficção";
                break;
            case 'N':
                categoria = "Não ficção";
                break;
            case 'T':
                categoria = "Tecnologia";
                break;
            case 'H':
                categoria = "Historia";
                break;
        }


        System.out.println("Livro cadastrado: \"" + titulo + "\", de " + autor + ". Ele possui " + paginas + " páginas, custa R$" + preco + " e pertence à categoria " + categoria);
    }
}
