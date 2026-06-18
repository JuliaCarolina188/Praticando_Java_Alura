import java.util.ArrayList;
import java.util.List;

public class Compras {
    String nome;
    double preco;
    int quantidade;

    static void main() {
        Compras mouse = new Compras();
        mouse.nome = "Mouse gamer 1234";
        mouse.preco = 60;
        mouse.quantidade = 1;

        Compras monitor = new Compras();
        monitor.nome = "Monitor gamer 12345";
        monitor.preco = 120;
        monitor.quantidade = 2;

        List<Compras> carrinho = new ArrayList<>();
        carrinho.add(mouse);
        carrinho.add(monitor);

        double total = 0;
        for(Compras produto : carrinho){
            System.out.println("\"" + produto.nome + "\", R$ " +  produto.preco + ". " + produto.quantidade + " unidades");
            total += produto.preco * produto.quantidade;
        }
        System.out.println("Total: " + total);
    }
}
