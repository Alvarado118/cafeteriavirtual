public class Cafe extends Bebida {
    public Cafe() {
        super("Café", 3.0);
    }

    public double costo() {
        return precioBase;
    }
}