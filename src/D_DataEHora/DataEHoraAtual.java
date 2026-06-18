package D_DataEHora;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DataEHoraAtual {
    static void main() {
        LocalTime horaAgora = LocalTime.now();
        LocalDate dataAgora = LocalDate.now();

        DateTimeFormatter formatData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatHora = DateTimeFormatter.ofPattern("hh:mm:ss");

        System.out.println("Data da criação" + dataAgora.format(formatData));
        System.out.println("Hora da criação: " + horaAgora.format(formatHora));
    }
}
