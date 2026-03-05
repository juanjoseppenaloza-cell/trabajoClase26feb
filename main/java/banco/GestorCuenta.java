package banco;

public class GestorCuenta {
    private final Cuenta cuenta;

    public GestorCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public void depositar(double monto) {
        cuenta.depositar(monto);
        System.out.println("Depósito de $" + monto + " realizado.");
    }

    public void retirar(double monto) {
        if (cuenta.retirar(monto)) {
            System.out.println("Retiro de $" + monto + " exitoso.");
        } else {
            System.out.println("Error: Saldo insuficiente para retirar $" + monto);
        }
    }

    public void mostrarSaldo() {
        System.out.println("Saldo actual en la cuenta: $" + cuenta.obtenerSaldo());
    }
}