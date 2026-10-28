
public class Perro extends Domestico {

    private String raza;

    public Perro(String nombre, int edad, double peso,
                 String raza) {

        super(nombre, edad, peso, "Alto", true);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    @Override
    public void emitirSonido() {
        System.out.println(getNombre() + " dice: Guau, guau!");
    }

    public void entrenar() {
        System.out.println(getNombre() + " esta entrenando.");
    }
}
