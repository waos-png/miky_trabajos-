package Dandadan;
//herencia
public class Momo extends personajes {
    public Momo(String nombre, int edad) {
        super(
            nombre,
            edad,
            "Psíquico",
            "Telequinesis",
            "Percepción espiritual, fuerza física",
            "Ataques psíquicos, defensa espiritual",
            80, 
            100, 
            70, 
            60,
            "Momo Ayase es una chica con habilidades psíquicas y percepción espiritual, capaz de usar telequinesis para combatir entidades sobrenaturales."
        );
    }
    //polimorfismo
    @Override
    public void accion() {
        System.out.println(getNombre() + " usa sus poderes psíquicos para luchar.");
        atacar();
        defender();
        usarPoder();
        recuperarEnergia(10);
    }
}