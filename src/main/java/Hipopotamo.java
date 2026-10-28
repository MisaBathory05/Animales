

public class Hipopotamo extends Salvaje {

    private double tiempoEnAgua;

    public Hipopotamo(String nombre, int edad, double peso,
                      String habitat, double tiempoEnAgua) {

        super(nombre, edad, peso, habitat, false);
        this.tiempoEnAgua = tiempoEnAgua;
    }

    public double getTiempoEnAgua() {
        return tiempoEnAgua;
    }

    @Override
    public void emitirSonido() {
        System.out.println(getNombre()
                + " emite grunidos y resoplidos.");
    }

    public void entrarAlAgua() {
        System.out.println(getNombre()
                + " entra al agua para refrescarse.");
    }
}
