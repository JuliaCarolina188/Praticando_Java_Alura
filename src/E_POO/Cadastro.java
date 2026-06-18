package E_POO;

import java.util.Scanner;

public class Cadastro {
    String nome;
    String cargoAtual;
    String novoCargo;
    int nivelAtual;
    int nivelNovo;

    static void main() {
        Cadastro pessoa = new Cadastro();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome\n>");
        pessoa.nome = scanner.nextLine();
        scanner.nextLine();

        System.out.print("Digite seu cargo atual\n>");
        pessoa.cargoAtual = scanner.next();

        System.out.print("Digite seu nível de acesso atual\n>");
        pessoa.nivelAtual = scanner.nextInt();

        System.out.print("Digite seu novo cargo\n>");
        pessoa.novoCargo = scanner.next();

        System.out.print("Digite seu novo nível de acesso\n>");
        pessoa.nivelNovo = scanner.nextInt();

        pessoa.info();
    }

    void info(){
        System.out.println("---Antes da atualização---" +
                "\nNome: " + nome +
                "\nCargo: " + cargoAtual +
                "\nNivel de acesso: " + nivelAtual);
        System.out.println("\n---Depois da atualização---" +
                "\nNome: " + nome +
                "\nCargo: " + novoCargo +
                "\nNivel de acesso: " + nivelNovo);
    }
}
