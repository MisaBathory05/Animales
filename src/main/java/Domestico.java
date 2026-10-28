

public abstract class Domestico extends Animal
        implements Cuidable {

    private String nivelDomesticacion;
    private boolean necesitaCuidadosHumanos;

    public Domestico(String nombre, int edad, double peso,
                     String nivelDomesticacion,
                     boolean necesitaCuidadosHumanos) {

        super(nombre, edad, peso);
        this.nivelDomesticacion = nivelDomesticacion;
        this.necesitaCuidadosHumanos = necesitaCuidadosHumanos;
    }

    public String getNivelDomesticacion() {
        return nivelDomesticacion;
    }

    public boolean isNecesitaCuidadosHumanos() {
        return necesitaCuidadosHumanos;
    }

    @Override
    public void recibirCuidados() {
        System.out.println(getNombre()
                + " recibe cuidados de las personas.");
    }
}

