

public class Canela extends IngredienteAdicional {
    public Canela(Bebida bebida) {
        super(bebida, "Canela", 0.5);
    }

    public double costo() {
        return bebida.costo() + precioBase;
    }
}



