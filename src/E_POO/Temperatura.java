package E_POO;

public class Temperatura {
    String local;
    double temperatura;

    static void main() {
        Temperatura tmp = new Temperatura();

        tmp.temperatura = 36;
        tmp.local = "Ala 2";

        tmp.verTemperatura();

        tmp.temperatura = 40;

        tmp.verTemperatura();
    }
    void verTemperatura(){
        System.out.println("Local monitorado: " + local);
        System.out.printf("Temperatura: %.1fºC\n", temperatura);
        if (temperatura >= 37.5){
            System.out.println("Temperatura acima do limite!");
        }
    }

}
