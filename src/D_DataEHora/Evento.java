package D_DataEHora;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Evento {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a data do evento(dd/mm/yyyy)\n>");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataEvento = LocalDate.parse(scanner.next(), formatter);

        LocalDate agora = LocalDate.now();

        System.out.println("Data atual: " + agora.format(formatter));
        System.out.println("Data do evento: " + dataEvento.format(formatter));
        Period periodo = Period.between(dataEvento, agora);

        if (agora.isAfter(dataEvento)){
            System.out.println("Evento já passou.");
            System.out.println(periodo.getDays() + " dias de diferença");
        } else if (agora.isBefore(dataEvento)){
            System.out.println("Evento ainda não chegou.");
            System.out.println(periodo.getDays() + " dias até o evento.");
        } else if (agora.isEqual(dataEvento)) {
            System.out.println("Evento hoje!");
        } else {
            System.out.println("Indefinido");
        }
    }
}
