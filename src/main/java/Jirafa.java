
public class Jirafa extends Salvaje {

    private double longitudCuello;

    public Jirafa(String nombre, int edad, double peso,
                  String habitat, double longitudCuello) {

        super(nombre, edad, peso, habitat, false);
        this.longitudCuello = longitudCuello;
    }

    public double getLongitudCuello() {
        return longitudCuello;
    }

    @Override
    public void emitirSonido() {
        System.out.println(getNombre()
                + " emite sonidos suaves.");
    }

    public void comerHojas() {
        System.out.println(getNombre()
                + " come hojas de los arboles.");
    }
}

