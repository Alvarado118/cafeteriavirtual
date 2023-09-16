public class Chocolate extends IngredienteAdicional {
    public Chocolate(Bebida bebida) {
        super(bebida, "Chocolate", 3.0);
    }

    public double costo() {
        return bebida.costo() + precioBase;
    }
}