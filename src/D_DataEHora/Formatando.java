package D_DataEHora;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Formatando {
    static void main() {

        LocalDate dataAgora = LocalDate.now();
        LocalTime horaAgora = LocalTime.now();

        DateTimeFormatter formatData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatHora = DateTimeFormatter.ofPattern("hh:mm");

        System.out.println("Data formatada: " + dataAgora.format(formatData));
        System.out.println("Hora formatada: " + horaAgora.format(formatHora));
    }
}
