package Dandadan;
public class Okarun extends personajes {
    public Okarun(String nombre, int edad) {
        super(
            nombre,
            edad,
            "Espiritual",
            "Turbo Speed",
            "Transformación, velocidad extrema y puede correr 100km/h ",
            90, 
            85, 
            80, 
            70  
        );
    }

    @Override
    public void accion() {
        System.out.println(getNombre() + " se puede transformar en una versión de la turbo abuela y corre a gran velocidad, por el momento no se ha visto al 100%.");
        atacar();
        defender();
        usarPoder();
        recuperarEnergia(15);
    }
}