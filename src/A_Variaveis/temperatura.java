package A_Variaveis;

import java.util.Scanner;

public class temperatura {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o temperatura\n>");
        double celcius = input.nextDouble();

        double Fahrenheit = (celcius * 9 / 5) + 32;

        System.out.println("Celcius: " + celcius + "\nFahrenheit: " + Fahrenheit);
    }
}
