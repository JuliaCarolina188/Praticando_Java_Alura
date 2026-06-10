package A_Variaveis;

public class combustivel {
    static void main() {
        double consumoMedio = 12.5; // O carro faz 12,5 km por litro
        double capacidadeTanque = 50; // O tanque tem capacidade para 50 litros
        double combustivelAtual = 3.9; // Há 20 litros disponíveis
        double distanciaViagem = 200; // A viagem planejada tem 200 km

        double autonomiaMaxima = capacidadeTanque * consumoMedio;
        double autonomiaAtual = capacidadeTanque * combustivelAtual;
        double suficiencia = autonomiaAtual - distanciaViagem;

        System.out.println("Autonomia máxima: " + autonomiaMaxima + " km\nAutonomia Atual: " + autonomiaAtual + " km\n");
        if (suficiencia >= 0) {
            System.out.println("Será possível completar a viajem");
        } else {
            System.out.println("Não será possível completar a viajem");
        }
    }
}
