package Animales;

public class Gato extends Animal implements ColorAnimal {
    public Gato(){

    }

    @Override
    public String Sonido() {
        return "Miau miau";
    }

    @Override
    public String Color() {
        return "El gato es gris";
    }
}
