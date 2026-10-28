public class Cocodrilo extends Salvaje {

    private double longitudHocico;

    public Cocodrilo(String nombre, int edad, double peso,
                     String habitat, double longitudHocico) {

        super(nombre, edad, peso, habitat, true);
        this.longitudHocico = longitudHocico;
    }

    public double getLongitudHocico() {
        return longitudHocico;
    }

    @Override
    public void emitirSonido() {
        System.out.println(getNombre() + " emite grunidos.");
    }

    public void nadar() {
        System.out.println(getNombre() + " nada en el agua.");
    }
}
