public class Auto extends Vehiculo {
    public Auto(String marca, String modelo, int año) {
        super(marca, modelo, año);
    }

    @Override
    public void acelerar() {
        System.out.println("El auto acelera rápidamente.");
    }
}