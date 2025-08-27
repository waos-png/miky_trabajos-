package Dandadan;
public class Aira extends personajes {
    public Aira(String nombre, int edad) {
        super(
            nombre,
            edad,
            "Espiritual",
            "Técnicas de exorcismo",
            "Combate espiritual, agilidad",
            85,
            80, 
            75, 
            65  
        );
    }

    @Override
    public void accion() {
        System.out.println(getNombre() + " combate con técnicas espirituales.");
        atacar();
        defender();
        usarPoder();
        recuperarEnergia(12);
    }
}