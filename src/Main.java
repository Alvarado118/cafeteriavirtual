public class Main {
    public static void main(String[] args) {
        // Crear una bebida base
        Bebida miCafe = new Cafe();
        System.out.println("Descripción: " + miCafe.descripcion() + ", Costo: " + miCafe.costo() + " quetzales");

        // Agregar ingredientes adicionales al café
        Bebida miCafeConLeche = new Leche(miCafe);
        System.out.println("Descripción: " + miCafeConLeche.descripcion() + ", Costo: " + miCafeConLeche.costo() + " quetzales");

        Bebida miCafeConChocolate = new Chocolate(miCafe);
        System.out.println("Descripción: " + miCafeConChocolate.descripcion() + ", Costo: " + miCafeConChocolate.costo() + " quetzales");

        Bebida miCafeConLecheYChocolate = new Chocolate(new Leche(miCafe));
        System.out.println("Descripción: " + miCafeConLecheYChocolate.descripcion() + ", Costo: " + miCafeConLecheYChocolate.costo() + " quetzales");
    }
}