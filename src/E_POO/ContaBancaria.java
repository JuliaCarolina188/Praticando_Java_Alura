package E_POO;

public class ContaBancaria {
    double saldo;

    static void main() {
        ContaBancaria conta = new ContaBancaria();

        conta.saldo = 50000.00;
        System.out.printf("Saldo atual: %.2f\n", conta.verSaldo());
        conta.zerarSaldo();
        System.out.println("Saldo resetado. Saldo atual: " + conta.verSaldo());
    }

    void zerarSaldo(){
        saldo = 0.0;
    }

    double verSaldo(){
        return saldo;
    }
}
