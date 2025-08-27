package Dandadan;
public abstract class personajes {
    private String nombre;
    private int edad;
    private String tipoPoder;
    private String poder;
    private String habilidades;
    private int nivel_stamina;
    private int nivel_energia;
    private int nivel_ataque;
    private int nivel_defensa;

    public personajes(String nombre, int edad, String tipoPoder, String poder, String habilidades, int nivel_stamina, int nivel_energia, int nivel_ataque, int nivel_defensa) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipoPoder = tipoPoder;
        this.poder = poder;
        this.habilidades = habilidades;
        this.nivel_stamina = nivel_stamina;
        this.nivel_energia = nivel_energia;
        this.nivel_ataque = nivel_ataque;
        this.nivel_defensa = nivel_defensa;
    }

    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public String getTipoPoder() { return tipoPoder; }
    public String getPoder() { return poder; }
    public String getHabilidades() { return habilidades; }
    public int getNivelStamina() { return nivel_stamina; }
    public int getNivelEnergia() { return nivel_energia; }
    public int getNivelAtaque() { return nivel_ataque; }
    public int getNivelDefensa() { return nivel_defensa; }

    public void atacar() {
        System.out.println(nombre + " ataca con fuerza de " + nivel_ataque + ".");
    }

    public void defender() {
        System.out.println(nombre + " se defiende con nivel " + nivel_defensa + ".");
    }

    public void usarPoder() {
        System.out.println(nombre + " usa su poder especial: " + poder + ".");
    }

    public void recuperarEnergia(int cantidad) {
        nivel_energia += cantidad;
        System.out.println(nombre + " recupera " + cantidad + " puntos de energía. Energía actual: " + nivel_energia);
    }

    public void mostrarInfo() {
        System.out.println(
            "    Nombre: " + nombre +
            "\n    Edad: " + edad +
            "\n    Tipo de Poder: " + tipoPoder +
            "\n    Poder: " + poder +
            "\n    Habilidades: " + habilidades +
            "\n    Nivel Stamina: " + nivel_stamina +
            "\n    Nivel Energía: " + nivel_energia +
            "\n    Nivel Ataque: " + nivel_ataque +
            "\n    Nivel Defensa: " + nivel_defensa
        );
    }

    public abstract void accion();
}