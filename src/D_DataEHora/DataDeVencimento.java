package D_DataEHora;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DataDeVencimento {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a data de vencimento original(dd/mm/yyyy)\n>");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.parse(scanner.next(), formatter);

        System.out.print("Digite em quantos meses o prazo foi aumentado\n>");
        int meses = scanner.nextInt();

        System.out.println("Prazo aumentado para " + data.plusMonths(meses));
    }
}
