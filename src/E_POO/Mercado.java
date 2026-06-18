package E_POO;

public class Mercado {
    String nome;
    int quantidade;

    static void main() {
        Mercado massa = new Mercado();
        massa.nome = "Massa Italiani";
        massa.quantidade = 100;

        massa.verEstoque();
        massa.vender(67);
        massa.verEstoque();
        massa.vender(35);
    }

    void verEstoque(){
        System.out.println(nome + ". Estoque de " + quantidade + " unidades.");
    }

    void vender(int quantidadeAVender){
        if(quantidadeAVender > quantidade){
            System.out.println("Estoque insuficiente");
        } else {
            quantidade -= quantidadeAVender;
            System.out.println("Venda realizada");
            verEstoque();
        }
    }

    void adicionarAoEstoque(int quantidadeAAdcionar){
        quantidade += quantidadeAAdcionar;
    }
}
