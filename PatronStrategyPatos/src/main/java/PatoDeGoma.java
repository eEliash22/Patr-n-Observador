public class PatoDeGoma extends Pato {

    private String color;

    public PatoDeGoma(String color) {
        super("pato de goma",
                new NoVolar(),
                new GraznarSilencioso());

        if (color == null || color.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "El color no puede estar vacío.");
        }

        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Color: " + color);
    }
}