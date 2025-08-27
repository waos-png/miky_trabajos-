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
            75,
            90, 
            65, 
            80 
        );
        this.aguaTocada = aguaTocada;
    }

    public String getAguaTocada() {
        return aguaTocada;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("agua tocada: " + aguaTocada);
    }

    @Override
    public void accion() {
        if ("fria".equals(aguaTocada)) {
            System.out.println(getNombre() + " se transforma por tocar agua fria.");
            usarPoder();
            atacar();
        } else if ("caliente".equals(aguaTocada)) {
            System.out.println(getNombre() + " está en estado normal y solo puede defenderse o huir.");
            defender();
            System.out.println(getNombre() + " corre para protegerse.");
        } else {
            System.out.println(getNombre() + " está en estado normal.");
            defender();
            System.out.println(getNombre() + " corre para protegerse.");
        }
        recuperarEnergia(8);
    }
}