package Trasporte;

public class Bicicleta extends Transporte {
    public Bicicleta(String marca, String modelo, int velocidadMaxima) {
        super(marca, modelo, velocidadMaxima);
    }

    @Override
    public void arrancar() {
        System.out.println("La bicicleta ha arrancado.");
    }

    @Override
    public void frenar() {
        System.out.println("La bicicleta ha frenado.");
    }

    @Override
    public void tipoCombustible() {
        System.out.println("Combustible: No usa combustible");
    }
}