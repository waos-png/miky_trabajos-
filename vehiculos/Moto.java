public class Moto extends Vehiculo {
    public Moto(String marca, String modelo, int año) {
        super(marca, modelo, año);
    }

    @Override
    public void acelerar() {
        System.out.println("La moto acelera con agilidad.");
    }
}