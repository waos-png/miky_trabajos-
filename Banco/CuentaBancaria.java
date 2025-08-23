import java.util.Scanner;

public class CuentaBancaria {
    private String titular;
    private String numeroCuenta;
    private double saldo;

    public CuentaBancaria(String titular, String numeroCuenta, double saldoInicial) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
    }

    public void mostrarDatos() {
        System.out.println("Titular: " + titular);
        System.out.println("Número de Cuenta: " + numeroCuenta);
        System.out.println("Saldo: $" + saldo);
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito realizado. Nuevo saldo: $" + saldo);
        } else {
            System.out.println("Cantidad inválida.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro realizado. Nuevo saldo: $" + saldo);
        } else {
            System.out.println("Cantidad inválida o saldo insuficiente.");
        }
    }

    public void transferir(CuentaBancaria destino, double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            destino.saldo += cantidad;
            System.out.println("Transferencia realizada. Nuevo saldo: $" + saldo);
        } else {
            System.out.println("Cantidad inválida o saldo insuficiente.");
        }
    }

    public static double leerDouble(Scanner sc, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            if (sc.hasNextDouble()) {
                double valor = sc.nextDouble();
                sc.nextLine();
                return valor;
            } else {
                System.out.println("Por favor, ingresa un número válido.");
                sc.nextLine();
            }
        }
    }

    public static String leerNumeroCuenta(Scanner sc, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String entrada = sc.nextLine();
            if (entrada.matches("\\d+")) {
                return entrada;
            } else {
                System.out.println("Por favor, ingresa solo números para el número de cuenta.");
            }
        }
    }

    public static double leerCantidad(Scanner sc, String mensaje) {
        return leerDouble(sc, mensaje);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Titular: ");
        String titular = sc.nextLine();
        String numeroCuenta = leerNumeroCuenta(sc, "Número de cuenta: ");
        double saldoInicial = leerDouble(sc, "Saldo inicial: ");

        CuentaBancaria cuenta = new CuentaBancaria(titular, numeroCuenta, saldoInicial);

        while (true) {
            System.out.println("\n1. Mostrar datos");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Transferir");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            int opcion = sc.hasNextInt() ? sc.nextInt() : -1;
            sc.nextLine();

            if (opcion == 1) {
                cuenta.mostrarDatos();
            } else if (opcion == 2) {
                double cantidad = leerCantidad(sc, "Cantidad a depositar: ");
                cuenta.depositar(cantidad);
            } else if (opcion == 3) {
                double cantidad = leerCantidad(sc, "Cantidad a retirar: ");
                cuenta.retirar(cantidad);
            } else if (opcion == 4) {
                System.out.print("Titular destino: ");
                String titularDestino = sc.nextLine();
                String numeroDestino = leerNumeroCuenta(sc, "Número de cuenta destino: ");
                double cantidad = leerCantidad(sc, "Cantidad a transferir: ");
                CuentaBancaria destino = new CuentaBancaria(titularDestino, numeroDestino, 0);
                cuenta.transferir(destino, cantidad);
                System.out.println("Datos de la cuenta destino:");
                destino.mostrarDatos();
            } else if (opcion == 5) {
                System.out.println("Adiós.");
                break;
            } else {
                System.out.println("Opción no válida.");
            }
        }

        sc.close();
    }
}
