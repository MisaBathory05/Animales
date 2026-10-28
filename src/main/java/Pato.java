
public class Pato extends Domestico {

    private boolean puedeNadar;

    public Pato(String nombre, int edad, double peso,
                boolean puedeNadar) {

        super(nombre, edad, peso, "Medio", true);
        this.puedeNadar = puedeNadar;
    }

    public boolean isPuedeNadar() {
        return puedeNadar;
    }

    @Override
    public void emitirSonido() {
        System.out.println(getNombre() + " dice: Cuac, cuac!");
    }

    public void nadar() {
        if (puedeNadar) {
            System.out.println(getNombre() + " esta nadando.");
        } else {
            System.out.println(getNombre() + " no puede nadar.");
        }
    }
}
