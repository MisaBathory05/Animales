

public class Principal {

    public static void main(String[] args) {

        // Crear los animales domesticos
        Perro perro = new Perro("Max", 3, 12.5, "Labrador");
        Gato gato = new Gato("Luna", 2, 4.0, "Gris");
        Pato pato = new Pato("Donald", 1, 2.0, true);

        // Crear los animales salvajes
        Jirafa jirafa = new Jirafa(
                "Melman", 5, 800.0, "Sabana", 1.8);

        Cocodrilo cocodrilo = new Cocodrilo(
                "Coco", 7, 250.0, "Rio", 0.6);

        Hipopotamo hipopotamo = new Hipopotamo(
                "Gloria", 6, 1200.0, "Rio", 8.0);

        // Probar el polimorfismo
        System.out.println("=== SONIDOS DE LOS ANIMALES ===");

        Animal[] animales = {
            perro, gato, pato,
            jirafa, cocodrilo, hipopotamo
        };

        for (Animal animal : animales) {
            animal.emitirSonido();
        }

        // Probar comportamientos especificos
        System.out.println("\n=== COMPORTAMIENTOS ===");

        perro.entrenar();
        gato.ronronear();
        pato.nadar();
        jirafa.comerHojas();
        cocodrilo.nadar();
        hipopotamo.entrarAlAgua();

        // Probar metodos generales
        System.out.println("\n=== FUNCIONES GENERALES ===");

        perro.respirar();
        gato.alimentarse();
        jirafa.dormir();

        // Probar la interfaz Cuidable
        System.out.println("\n=== CUIDADO DE ANIMALES ===");

        Cuidable[] animalesDomesticos = {
            perro, gato, pato
        };

        for (Cuidable animal : animalesDomesticos) {
            animal.recibirCuidados();
        }

        // Mostrar atributos
        System.out.println("\n=== INFORMACION DEL PERRO ===");
        System.out.println("Nombre: " + perro.getNombre());
        System.out.println("Edad: " + perro.getEdad());
        System.out.println("Peso: " + perro.getPeso());
        System.out.println("Raza: " + perro.getRaza());
    }
}
