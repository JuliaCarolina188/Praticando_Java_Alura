package D_DataEHora;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class Diferença {
    static void main() {
        Scanner input = new Scanner(System.in);

        /*
        * LocalTime horarioInicio = LocalTime.of(14, 30, 0);
        LocalTime horarioTermino = LocalTime.of(16, 45, 0);
        * */

        System.out.print("Digite o primeiro horário\n>");
        String primeiroHorario = input.next();

        System.out.print("Digite o segnudo horário\n>");
        String segundoHorario = input.next();

        LocalTime horaUm = LocalTime.parse(primeiroHorario);
        LocalTime horaDois = LocalTime.parse(segundoHorario);

        Duration diferenca = Duration.between(horaUm, horaDois);

        System.out.println("Diferença entre os horários: " + diferenca.toHours() + " horas e " + diferenca.toMinutesPart() + " minutsos");
    }
}
