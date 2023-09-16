public class Leche extends IngredienteAdicional {
    public Leche(Bebida bebida) {
        super(bebida, "Leche", 2.0);
    }

    public double costo() {
        return bebida.costo() + precioBase;
    }
}