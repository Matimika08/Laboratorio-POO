public class Jugador {

    private String nombre;
    private int nivel;
    private int puntos;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.nivel = 1;
        this.puntos = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPuntos() {
        return puntos;
    }

    public void ganarPuntos(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("  [rechazado] " + nombre
                    + ": no se pueden sumar " + cantidad
                    + " puntos. Solo se aceptan cantidades positivas.");
            return;
        }
        puntos += cantidad;
        System.out.println("  " + nombre + " ganó " + cantidad + " puntos.");
    }

    public void subirNivel() {
        nivel++;
        System.out.println("  " + nombre + " subió al nivel " + nivel + ".");
    }
}