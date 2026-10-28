public abstract class Animal {

    private String nombre;
    private int edad;
    private double peso;

    public Animal(String nombre, int edad, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public void respirar() {
        System.out.println(nombre + " esta respirando.");
    }

    public void alimentarse() {
        System.out.println(nombre + " esta alimentandose.");
    }

    public void dormir() {
        System.out.println(nombre + " esta durmiendo.");
    }

    public abstract void emitirSonido();
}
