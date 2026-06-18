package D_DataEHora;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Sydney {
    static void main() {
        ZonedDateTime agora = ZonedDateTime.now();
        ZonedDateTime tokio = agora.withZoneSameInstant(ZoneId.of("Australia/Sydney"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm - dd/MM/yyyy");

        System.out.println("Agora, em Sydney: " + tokio.format(formatter));
    }
}
