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
