public abstract class Bebida {
    protected String nombre;
    protected double precioBase;

    public Bebida(String nombre, double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    public abstract double costo();

    public String descripcion() {
        return nombre;
    }
}
