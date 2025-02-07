// Clase base
class Habitacion {
    private int numero; // Encapsulamiento
    private int capacidad;
    private double precio;

    public Habitacion(int numero, int capacidad, double precio) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.precio = precio;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public double getPrecio() {
        return precio;
    }
}

// Subclase para habitaciones estándar
class HabitacionEstandar extends Habitacion {
    public HabitacionEstandar(int numero) {
        super(numero, 2, 50.0); // Capacidad: 2, Precio: 50
    }
}

// Subclase para habitaciones de lujo
class HabitacionDeluxe extends Habitacion {
    public HabitacionDeluxe(int numero) {
        super(numero, 4, 120.0); // Capacidad: 4, Precio: 120
    }
}

// Main
public class Main {
    public static void main(String[] args) {
        Habitacion estandar = new HabitacionEstandar(101);
        Habitacion deluxe = new HabitacionDeluxe(202);

        System.out.println("Habitación estándar - Precio: " + estandar.getPrecio() + " USD, Capacidad: " + estandar.getCapacidad());
        System.out.println("Habitación deluxe - Precio: " + deluxe.getPrecio() + " USD, Capacidad: " + deluxe.getCapacidad());
    }
}
