package Dandadan;
public class Jiji extends personajes {
    private String aguaTocada; 

    public Jiji(String nombre, int edad, String aguaTocada) {
        super(
            nombre,
            edad,
            "Maldición",
            "Mal de ojo",
            "Control de energía maldita",
            "Transformación por agua, ataques malditos",
            75,
            90, 
            65, 
            80,
            "Jiji está maldito y puede transformarse dependiendo del tipo de agua que toque, usando el mal de ojo para atacar o defenderse."
        );
        this.aguaTocada = aguaTocada;
    }

    public String getAguaTocada() {
        return aguaTocada;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("    Agua tocada: " + aguaTocada);
    }

    @Override
    public void accion() {
        if ("fria".equals(aguaTocada)) {
            System.out.println(getNombre() + " usa el mal de ojo por tocar agua fría (transformación).");
            usarPoder();
            atacar();
        } else if ("caliente".equals(aguaTocada)) {
            System.out.println(getNombre() + " está en estado normal y solo puede defenderse o huir.");
            defender();
            System.out.println(getNombre() + " corre para protegerse.");
        } else {
            System.out.println(getNombre() + " no ha tocado agua y no puede usar sus poderes.");
        }
        recuperarEnergia(8);
    }
}