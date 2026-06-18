package E_POO;

import java.util.ArrayList;
import java.util.List;

public class Tarefas {
    String descricao;
    boolean conclusao;

    static void main() {
        Tarefas desenho = new Tarefas();
        List<Tarefas> tarefas = new ArrayList<>();

        desenho.descricao = "Estudar desenho";
        desenho.conclusao = false;

        Tarefas java = new Tarefas();
        java.descricao = "Praticar Java";
        java.conclusao = true;

        Tarefas trabalhoDeHistoria = new Tarefas();
        trabalhoDeHistoria.descricao = "Fazer o trabalho de história";
        trabalhoDeHistoria.conclusao = false;


        tarefas.add(desenho);
        tarefas.add(java);
        tarefas.add(trabalhoDeHistoria);

        for (Tarefas tarefa : tarefas){
            tarefa.verTarefa();
        }
    }

    void verTarefa(){
        System.out.print("\nTarefa: " + descricao + "\nStatus: ");
        if(conclusao){
            System.out.println("Concluida");
        }else {
            System.out.println("Pendente");
        }
    }

}
