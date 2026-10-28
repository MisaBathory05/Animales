

public class Gato extends Domestico {

    private String colorPelaje;

    public Gato(String nombre, int edad, double peso,
                String colorPelaje) {

        super(nombre, edad, peso, "Alto", true);
        this.colorPelaje = colorPelaje;
    }

    public String getColorPelaje() {
        return colorPelaje;
    }

    @Override
    public void emitirSonido() {
        System.out.println(getNombre() + " dice: Miau!");
    }

    public void ronronear() {
        System.out.println(getNombre() + " esta ronroneando.");
    }
}
