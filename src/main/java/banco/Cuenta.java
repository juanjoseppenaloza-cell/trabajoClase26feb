package banco;

public class Cuenta {

    private double saldo;


    public Cuenta() {
        this.saldo = 0;
    }


    public Cuenta(double saldoInicial) {
        this.saldo = Math.max(0, saldoInicial);
    }


    public void depositar(double monto) {
        if (monto > 0) {
            this.saldo += monto;
        }
    }


    public boolean retirar(double monto) {
        if (monto > 0 && monto <= this.saldo) {
            this.saldo -= monto;
            return true;
        }
        return false;
    }


    public double obtenerSaldo() {
        return this.saldo;
    }
}