package D_DataEHora;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Tokio {
    static void main() {
        ZonedDateTime agora = ZonedDateTime.now();
        ZonedDateTime tokio = agora.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm - dd/MM/yyyy");

        System.out.println("Agora, em Tokio: " + tokio.format(formatter));
    }
}
