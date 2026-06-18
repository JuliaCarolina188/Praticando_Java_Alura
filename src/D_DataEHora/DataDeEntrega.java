package D_DataEHora;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DataDeEntrega {
    static void main() {
        Scanner input = new Scanner(System.in);
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.print("Digite a data da entrega(00/00/0000)\n>");
        LocalDate data = LocalDate.parse(input.next(), formatador);

        System.out.print("Digite o prazo de entrega\n>");
        int prazo = input.nextInt();

        System.out.println("Dia da entrega: " + data.plusDays(prazo).format(formatador));
    }
}
