
// CLASE BASE
// Contiene los atributos y métodos que serán heredados.
class Estudiante {

    String nombre;
    int edad;
    double calificacion;

    // Constructor de la clase base
    public Estudiante(String nombre, int edad, double calificacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.calificacion = calificacion;
    }

    // Método heredable para mostrar la información
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Calificacion: " + calificacion);
    }

    // Método heredable para verificar la aprobación
    public void verificarAprobacion() {
        if (calificacion >= 70) {
            System.out.println("Estado: Aprobado");
        } else {
            System.out.println("Estado: Reprobado");
        }
    }
}

// SUBCLASE 1: ESTUDIANTE PRESENCIAL
// Hereda los atributos y métodos de Estudiante.
class EstudiantePresencial extends Estudiante {

    String salon;

    // Constructor que utiliza super para llamar al constructor base
    public EstudiantePresencial(String nombre, int edad,
                                double calificacion, String salon) {
        super(nombre, edad, calificacion);
        this.salon = salon;
    }

    // Sobrescritura del método de la clase base
    @Override
    public void mostrarInformacion() {
        System.out.println("Tipo: Estudiante presencial");
        super.mostrarInformacion();
        System.out.println("Salon: " + salon);
    }

    // Método exclusivo de esta subclase
    public void mostrarSalon() {
        System.out.println("El estudiante asiste al salon: " + salon);
    }
}

// SUBCLASE 2: ESTUDIANTE EN LINEA
// También hereda de la clase Estudiante.
class EstudianteEnLinea extends Estudiante {

    String plataforma;

    // Constructor que reutiliza el constructor de la clase base
    public EstudianteEnLinea(String nombre, int edad,
                             double calificacion, String plataforma) {
        super(nombre, edad, calificacion);
        this.plataforma = plataforma;
    }

    // Sobrescritura del método de la clase base
    @Override
    public void mostrarInformacion() {
        System.out.println("Tipo: Estudiante en linea");
        super.mostrarInformacion();
        System.out.println("Plataforma: " + plataforma);
    }

    // Método exclusivo de esta subclase
    public void mostrarPlataforma() {
        System.out.println("El estudiante utiliza: " + plataforma);
    }
}

// CLASE PRINCIPAL
public class Main {

    public static void main(String[] args) {

        // Creación de un objeto de la subclase presencial
        EstudiantePresencial estudiante1 =
            new EstudiantePresencial("Carlos", 20, 85.5, "Aula 101");

        // Creación de un objeto de la subclase en línea
        EstudianteEnLinea estudiante2 =
            new EstudianteEnLinea("Ana", 19, 65.0, "Google Classroom");

        // Información del estudiante presencial
        System.out.println("=== ESTUDIANTE 1 ===");
        estudiante1.mostrarInformacion();
        estudiante1.verificarAprobacion();
        estudiante1.mostrarSalon();

        System.out.println();

        // Información del estudiante en línea
        System.out.println("=== ESTUDIANTE 2 ===");
        estudiante2.mostrarInformacion();
        estudiante2.verificarAprobacion();
        estudiante2.mostrarPlataforma();
    }
}
