package Dandadan;
public class Okarun extends personajes {
    public Okarun(String nombre, int edad) {
        super(
            nombre,
            edad,
            "Espiritual",
            "Turbo Speed",
            "Transformación, velocidad extrema",
            "Ataques veloces, esquiva rápida",
            90, 
            85, 
            80, 
            70,
            "Okarun puede transformarse y alcanzar velocidades sobrehumanas, heredando el poder de la Turbo Abuela para combatir amenazas sobrenaturales."
        );
    }

    @Override
    public void accion() {
        System.out.println(getNombre() + " se transforma y corre a gran velocidad para atacar o esquivar.");
        atacar();
        defender();
        usarPoder();
        recuperarEnergia(15);
    }
}