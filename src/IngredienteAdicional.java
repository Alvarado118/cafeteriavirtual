public abstract class IngredienteAdicional extends Bebida {
    protected Bebida bebida;

    public IngredienteAdicional(Bebida bebida, String nombre, double costoAdicional) {
        super(nombre, bebida.precioBase + costoAdicional);
        this.bebida = bebida;
    }

    public abstract double costo();

    public String descripcion() {
        return bebida.descripcion() + ", " + nombre;
    }
}
