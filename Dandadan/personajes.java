package Dandadan;

public abstract class personajes {
    private String nombre;
    private int edad;
    private String tipoPoder;
    private String poderPrincipal;
    private String habilidadesFisicas;
    private String habilidadesDeCombate;
    private int nivelStamina;
    private int nivelEnergia;
    private int nivelAtaque;
    private int nivelDefensa;
    private String descripcion;

    public personajes(String nombre, int edad, String tipoPoder, String poderPrincipal, String habilidadesFisicas, String habilidadesDeCombate, int nivelStamina, int nivelEnergia, int nivelAtaque, int nivelDefensa, String descripcion) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipoPoder = tipoPoder;
        this.poderPrincipal = poderPrincipal;
        this.habilidadesFisicas = habilidadesFisicas;
        this.habilidadesDeCombate = habilidadesDeCombate;
        this.nivelStamina = nivelStamina;
        this.nivelEnergia = nivelEnergia;
        this.nivelAtaque = nivelAtaque;
        this.nivelDefensa = nivelDefensa;
        this.descripcion = descripcion;
    }

    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public String getTipoPoder() { return tipoPoder; }
    public String getPoderPrincipal() { return poderPrincipal; }
    public String getHabilidadesFisicas() { return habilidadesFisicas; }
    public String getHabilidadesDeCombate() { return habilidadesDeCombate; }
    public int getNivelStamina() { return nivelStamina; }
    public int getNivelEnergia() { return nivelEnergia; }
    public int getNivelAtaque() { return nivelAtaque; }
    public int getNivelDefensa() { return nivelDefensa; }
    public String getDescripcion() { return descripcion; }

    public void atacar() {
        System.out.println(nombre + " ataca con " + habilidadesDeCombate + " (Ataque: " + nivelAtaque + ").");
    }

    public void defender() {
        System.out.println(nombre + " se defiende usando " + habilidadesFisicas + " (Defensa: " + nivelDefensa + ").");
    }

    public void usarPoder() {
        System.out.println(nombre + " usa su poder principal: " + poderPrincipal + ".");
    }

    public void recuperarEnergia(int cantidad) {
        nivelEnergia += cantidad;
        System.out.println(nombre + " recupera " + cantidad + " puntos de energía. Energía actual: " + nivelEnergia);
    }

    public void mostrarInfo() {
        System.out.println(
            "    Nombre: " + nombre +
            "\n    Edad: " + edad +
            "\n    Tipo de Poder: " + tipoPoder +
            "\n    Poder Principal: " + poderPrincipal +
            "\n    Habilidades Físicas: " + habilidadesFisicas +
            "\n    Habilidades de Combate: " + habilidadesDeCombate +
            "\n    Nivel Stamina: " + nivelStamina +
            "\n    Nivel Energía: " + nivelEnergia +
            "\n    Nivel Ataque: " + nivelAtaque +
            "\n    Nivel Defensa: " + nivelDefensa +
            "\n    Descripción: " + descripcion
        );
    }

    public abstract void accion();
}