package Animales;
import java.util.Scanner;

public class main_Animales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elige un animal (perro/gato): ");
        String tipoAnimal = sc.nextLine();

        Animal animal;
        ColorAnimal colorAnimal;

        if (tipoAnimal.equalsIgnoreCase("perro")) {
            animal = new Perro(); 
            colorAnimal = (ColorAnimal) animal;
        } else if (tipoAnimal.equalsIgnoreCase("gato")) {
            animal = new Gato();
            colorAnimal = (ColorAnimal) animal;
        } else {
            System.out.println("Animal no reconocido.");
            sc.close();
            return;
        }

        System.out.println("El sonido del " + tipoAnimal + " es: " + animal.Sonido());
        System.out.println("Color: " + colorAnimal.Color());
        sc.close();
    }
}
