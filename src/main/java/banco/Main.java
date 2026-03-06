package banco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("--- BIENVENIDO AL BANCO EL AHORRADOR ---");
        System.out.print("Ingrese el monto para abrir su cuenta: $");
        double inicial = teclado.nextDouble();

        Cuenta miCuenta = new Cuenta(inicial);
        GestorCuenta gestor = new GestorCuenta(miCuenta);

        int opcion = 0;

        while (opcion != 4) {
            System.out.println("\n--- MENÚ DE TRANSACCIONES ---");
            System.out.println("1. Depositar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Monto a depositar: $");
                    double deposito = teclado.nextDouble();
                    gestor.depositar(deposito);
                    break;
                case 2:
                    System.out.print("Monto a retirar: $");
                    double retiro = teclado.nextDouble();
                    gestor.retirar(retiro);
                    break;
                case 3:
                    gestor.mostrarSaldo();
                    break;
                case 4:
                    System.out.println("Cerrando sesión. ¡Gracias por usar El Ahorrador!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }

        teclado.close();
    }
}