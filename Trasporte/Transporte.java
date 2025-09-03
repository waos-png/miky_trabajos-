package Trasporte;

public abstract class Transporte implements Vehiculo {
    protected String marca;
    protected String modelo;
    protected int velocidadMaxima;

    public Transporte(String marca, String modelo, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidad Máxima: " + velocidadMaxima + " km/h");
    }

    public abstract void tipoCombustible();
}