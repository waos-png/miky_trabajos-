import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculoBase = new Vehiculo("Genérica", "ModeloX", 2020);
        Vehiculo auto = new Auto("Toyota", "Corolla", 2022);
        Vehiculo moto = new Moto("Yamaha", "FZ", 2021);

        ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();
        listaVehiculos.add(vehiculoBase);
        listaVehiculos.add(auto);
        listaVehiculos.add(moto);

        for (Vehiculo v : listaVehiculos) {
            v.mostrarInformacion();
            v.acelerar();
            System.out.println("-----");
        }
    }
}