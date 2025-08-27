package Dandadan;
public class Momo extends personajes {
    public Momo(String nombre, int edad) {
        super(
            nombre,
            edad,
            "Psíquico",
            "Telequinesis",
            "Percepción espiritual, fuerza física",
            80, 
            100, 
            70, 
            60  
        );
    }

    @Override
    public void accion() {
        System.out.println(getNombre() + " usa sus poderes psíquicos para luchar.");
        atacar();
        defender();
        usarPoder();
        recuperarEnergia(10);
    }
}