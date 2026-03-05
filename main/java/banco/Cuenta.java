package banco;

public class Cuenta {
    // Encapsulamiento: atributo privado
    private double saldo;

    // RF1: Constructor por defecto (saldo $0)
    public Cuenta() {
        this.saldo = 0;
    }

    // RF2: Constructor con saldo inicial
    public Cuenta(double saldoInicial) {
        this.saldo = Math.max(0, saldoInicial);
    }

    // RF3: Método para depositar
    public void depositar(double monto) {
        if (monto > 0) {
            this.saldo += monto;
        }
    }

    // RF4: Método para retirar con validación
    public boolean retirar(double monto) {
        if (monto > 0 && monto <= this.saldo) {
            this.saldo -= monto;
            return true;
        }
        return false;
    }

    // RF5: Método para obtener saldo
    public double obtenerSaldo() {
        return this.saldo;
    }
}