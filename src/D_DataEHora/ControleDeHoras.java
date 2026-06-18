package D_DataEHora;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ControleDeHoras {
    static void main() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de horas diárias\n>");
        int cargaHoraria = scanner.nextInt();

        System.out.print("Digite o horário de entrada\n>");
        LocalTime chegada = LocalTime.parse(scanner.next(), formatter);

        LocalTime previsao = LocalTime.parse(chegada.plusHours(cargaHoraria).format(formatter));
        System.out.println("Previsão de saída: " + previsao);

        System.out.print("Digite o horário de saída\n>");
        LocalTime saida = LocalTime.parse(scanner.next(), formatter);

        Duration diferenca = Duration.between(previsao, saida);
        if(previsao == saida){
            System.out.println("Os horários batem. ");
        } else if (previsao.isAfter(saida)){
            System.out.println("Trabalhador saindo antes do esperdo. Faltam " + diferenca.toHours() + " horas e "
                    + diferenca.toMinutesPart() + " minutos");
        }else{
            System.out.println("Trabalhador saíndo depois do esperado. Sobram " + diferenca.toHours() + " horas e "
                    + diferenca.toMinutesPart() + " minutos");
        }
    }
}
