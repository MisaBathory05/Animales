
public abstract class Salvaje extends Animal {

    private String habitat;
    private boolean esDepredador;

    public Salvaje(String nombre, int edad, double peso,
                   String habitat, boolean esDepredador) {

        super(nombre, edad, peso);
        this.habitat = habitat;
        this.esDepredador = esDepredador;
    }

    public String getHabitat() {
        return habitat;
    }

    public boolean isEsDepredador() {
        return esDepredador;
    }

    public void buscarAlimento() {
        System.out.println(getNombre()
                + " busca alimento en su entorno natural.");
    }
}

