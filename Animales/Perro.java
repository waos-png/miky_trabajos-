package Animales;

public class Perro extends Animal implements ColorAnimal{
    public Perro(){

    }

    @Override
    public String Sonido() {
        return "Guau";
    }

    @Override
    public String Color() {
        return "El perro es cafe";
    }
}
