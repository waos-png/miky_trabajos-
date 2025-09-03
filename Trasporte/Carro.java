package Trasporte;

public class Carro extends Transporte {
    public Carro(String marca, String modelo, int velocidadMaxima) {
        super(marca, modelo, velocidadMaxima);
    }

    @Override
    public void arrancar() {
        System.out.println("El carro ha arrancado.");
    }

    @Override
    public void frenar() {
        System.out.println("El carro ha frenado.");
    }

    @Override
    public void tipoCombustible() {
        System.out.println("Combustible: Gasolina");
    }
}