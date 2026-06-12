package C_Repetição;

import java.util.Scanner;

public class ImparesEPares {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n;
        String nStr;
        int positivos = 0;
        int negativos = 0;
        int zeros = 0;

        System.out.println("Digite uma sequência de números qualquer. Para parar, \"fim\"");
        while(true){
            System.out.print(">");
            nStr = sc.next();

            if (nStr.equals("fim")) {
                System.out.println("Processo finalizado");
                break;
            } else {
                try{
                    n = Integer.parseInt(nStr);
                    if(n<0){
                        negativos++;
                    }else if (n == 0){
                        zeros++;
                    } else if (n > 0) {
                        positivos++;
                    } else {
                        System.out.println("Erro na detecção do numero");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("\tErro de conversão");
                } catch (Exception e) {
                    System.out.println("Erro: " +  e.getMessage());
                }
            }
        }
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Zero: " + zeros);
    }
}
