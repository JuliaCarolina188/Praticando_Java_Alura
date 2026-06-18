package D_DataEHora;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Exemplos {
    static void main() {
        LocalDate dataAgora = LocalDate.now();
        LocalDate dataDefinida = LocalDate.of(2026, 9, 5);
        LocalDate dataPlus = LocalDate.now().plusDays(30);

        /* Outras plus/minus
        * plusDays, plusWeeks, plusMounths, plusYears
        * minusDays, minusWeeks...
        *
        * Consicionais
        * isBefore, isAfter, isEqual
        * */

        System.out.println("Data atual: " + dataAgora);
        System.out.println("Daqui a 30 dias: " + dataPlus);
        System.out.println("Data pré definida: " + dataDefinida);

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Data bonita: " + dataAgora.format(format));

        ZonedDateTime dataZoned = ZonedDateTime.now();
        System.out.println("Horario brasil: " + dataZoned);

        ZonedDateTime zonedNY = dataZoned.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("Horario nova york: " + zonedNY);

        /*
        * Diferença entre datas
        * duration/period
        * */

        LocalTime inicio = LocalTime.of(7, 30);
        LocalTime fim = LocalTime.of(12, 15);

        Duration duracao = Duration.between(inicio, fim);
        System.out.println("Duração: " + duracao);
        System.out.println("DUração em horas: " + duracao.toHours());
        System.out.println("Duração + minutos: " + duracao.toMinutesPart());

        Period periodo = Period.between(dataAgora, dataPlus);

        System.out.println("Diferença: " + periodo.getMonths() + " meses e " + periodo.getDays() + " dias");
    }
}
