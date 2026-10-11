public class PatoSilvestre extends Pato {

    private int edad;

    public PatoSilvestre(int edad) {
        super("pato silvestre",
                new VueloConAlas(),
                new GraznarNormal());

        if (edad < 0) {
            throw new IllegalArgumentException(
                    "La edad no puede ser negativa.");
        }

        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Edad: " + edad + " años");
    }
}