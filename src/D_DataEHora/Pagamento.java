package D_DataEHora;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Pagamento {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Digite a data do pagamento(dd/mm/yyyy)\n>");
        LocalDate dataPagamento = LocalDate.parse(scanner.next(), formatter);

        System.out.print("Digite com quantos dias de antecedência o lembrete deve ser mandado\n>");
        int diasLembrete = scanner.nextInt();

        System.out.println("Dia do lembrete: " + dataPagamento.minusDays(diasLembrete).format(formatter));
    }
}
