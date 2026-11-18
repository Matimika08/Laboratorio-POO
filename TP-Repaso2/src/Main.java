public class Main {

    public static void main(String[] args) {
        ejercicio1();
        System.out.println();
        ejercicio2();
    }

    private static void ejercicio1() {
        System.out.println("1. JUGADOR");

        Jugador ana = new Jugador("Ana");
        Jugador luis = new Jugador("Luis");

        System.out.println("Datos iniciales:");
        mostrarJugador(ana);
        mostrarJugador(luis);

        System.out.println("Sumar puntos a ambos:");
        ana.ganarPuntos(150);
        luis.ganarPuntos(80);
        mostrarJugador(ana);
        mostrarJugador(luis);

        System.out.println("Intentar sumar una cantidad negativa:");
        ana.ganarPuntos(-40);
        mostrarJugador(ana);

        System.out.println("Subir el nivel de Luis:");
        luis.subirNivel();
        mostrarJugador(luis);
    }

    private static void mostrarJugador(Jugador jugador) {
        System.out.println("  Nombre: " + jugador.getNombre()+ "Nivel: " + jugador.getNivel()+ "Puntos: " + jugador.getPuntos());
    }

    private static void ejercicio2() {
        System.out.println("2. PERSONA / DOCENTE / PRECEPTOR");

        Docente docente = new Docente("María López", 35, "Matemática");
        Preceptor preceptor = new Preceptor("Carlos Ruiz", 42, "3° A");

        System.out.println("Datos iniciales:");
        docente.mostrarInformacion();
        System.out.println();
        preceptor.mostrarInformacion();

        System.out.println();
        System.out.println("Modificar la edad del docente con el setter (35 -> 36):");
        docente.setEdad(36);
        docente.mostrarInformacion();

        System.out.println();
        System.out.println("Intentar una edad negativa en el preceptor:");
        preceptor.setEdad(-5);
        preceptor.mostrarInformacion();
    }
}