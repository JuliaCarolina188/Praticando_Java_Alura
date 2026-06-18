package E_POO;

public class Media {
    String nome;
    double nota1;
    double nota2;

    static void main() {
        Media media = new Media();

        media.nome = "Julia";
        media.nota1 = 7.5;
        media.nota2 = 6.4;

        media.info();
    }

    double media(){
        return (nota1 + nota2) / 2;
    }

    String status(){
        double notaFinal = media();

        if(notaFinal >= 7){
            return "aprovado";
        } else {
            return "reprovado";
        }
    }

    void info(){
        System.out.printf("Aluno %s. Nota: %.2f, %s\n", nome, media(), status());
    }
}
