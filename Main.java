public class Main {
    public static void main(String[] args) {
        Habitacion estandar = new HabitacionEstandar(101);
        Habitacion deluxe = new HabitacionDeluxe(202);

        System.out.println("Habitación estándar - Precio: " + estandar.getPrecio() + " USD, Capacidad: " + estandar.getCapacidad());
        System.out.println("Habitación deluxe - Precio: " + deluxe.getPrecio() + " USD, Capacidad: " + deluxe.getCapacidad());
    }
}
