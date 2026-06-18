package E_POO;

public class ResumoDoLivro {
    String nome;
    String autor;
    int paginas;

    static void main() {
        ResumoDoLivro memorias = new ResumoDoLivro();

        memorias.nome = "Memórias póstumas de Brás Cubas";
        memorias.autor = "Machado de Asis";
        memorias.paginas = 120;

        System.out.println(memorias.infoLivro());
    }

    String infoLivro(){
        return "\"" + nome + "\", de " + autor + ". " + paginas + " páginas.";
    }
}
