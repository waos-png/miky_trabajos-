package Trasporte;
public class Moto extends Transporte {
    public Moto(String marca, String modelo, int velocidadMaxima) {
        super(marca, modelo, velocidadMaxima);
    }

    @Override
    public void arrancar() {
        System.out.println("La moto ha arrancado.");
    }

    @Override
    public void frenar() {
        System.out.println("La moto ha frenado.");
    }

    @Override
    public void tipoCombustible() {
        System.out.println("Combustible: Gasolina");
    }
}