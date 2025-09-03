package Dandadan;
public class Aira extends personajes {
    public Aira(String nombre, int edad) {
        super(
            nombre,
            edad,
            "Espiritual",
            "Fuerza sobrehumana",
            "Agilidad, reflejos elevados",
            "Combate espiritual, ataques físicos rápidos",
            85, 
            80, 
            75, 
            65,
            "Aira Shiratori destaca por su fuerza sobrehumana y agilidad, usando técnicas espirituales y ataques físicos rápidos en combate."
        );
    }

    @Override
    public void accion() {
        System.out.println(getNombre() + " combate con técnicas espirituales y ataques físicos rápidos.");
        atacar();
        defender();
        usarPoder();
        recuperarEnergia(12);
    }
}