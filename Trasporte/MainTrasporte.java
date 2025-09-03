package Trasporte;

import java.util.Scanner;

public class MainTrasporte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("que tipo de vehiculo desea registrar? (carro/moto/bicicleta):");
        String tipo = scanner.nextLine().toLowerCase();

        System.out.print("Marca: ");
        String marca = scanner.nextLine();

        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();

        System.out.print("Velocidad máxima: ");
        int velocidadMaxima = scanner.nextInt();

        Transporte vehiculo;

        switch (tipo) {
            case "carro":
                vehiculo = new Carro(marca, modelo, velocidadMaxima);
                break;
            case "moto":
                vehiculo = new Moto(marca, modelo, velocidadMaxima);
                break;
            case "bicicleta":
                vehiculo = new Bicicleta(marca, modelo, velocidadMaxima);
                break;
            default:
                System.out.println("Tipo de vehículo no válido.");
                scanner.close();
                return;
        }

        vehiculo.arrancar();
        vehiculo.frenar();
        vehiculo.tipoCombustible();
        vehiculo.mostrarInformacion();

        scanner.close();
    }
}