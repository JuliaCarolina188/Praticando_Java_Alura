package E_POO;

public class Produtos {
    String nome;
    double preco;
    int quantidade;

    static void main() {
        Produtos mouse = new Produtos();
        mouse.nome = "Mouse fodas 123";
        mouse.preco = 67.3456;
        mouse.quantidade = 2;

        mouse.infoProduto();
    }

    void infoProduto(){
        System.out.println("Produto: " + nome);
        System.out.printf("Preço: R$ %.2f\n", preco);
        System.out.println("Quantidade em estoque: " + quantidade);
    }
}
