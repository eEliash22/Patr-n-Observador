public abstract class Pato {

    protected String nombre;
    protected ComportamientoVuelo vuelo;
    protected ComportamientoGraznido graznido;

    public Pato(String nombre,
                ComportamientoVuelo vuelo,
                ComportamientoGraznido graznido) {
        this.nombre = nombre;
        this.vuelo = vuelo;
        this.graznido = graznido;
    }

    public void mostrar() {
        System.out.println("Soy un " + nombre);
    }

    public void realizarVuelo() throws ErrorPato {
        if (vuelo == null) {
            throw new ErrorPato("No se ha definido el vuelo.");
        }
        vuelo.volar();
    }

    public void realizarGraznido() throws ErrorPato {
        if (graznido == null) {
            throw new ErrorPato("No se ha definido el graznido.");
        }
        graznido.graznar();
    }

    public void establecerVuelo(ComportamientoVuelo vuelo) {
        if (vuelo == null) {
            throw new IllegalArgumentException(
                    "El comportamiento de vuelo no puede ser nulo.");
        }
        this.vuelo = vuelo;
    }

    public void establecerGraznido(
            ComportamientoGraznido graznido) {
        if (graznido == null) {
            throw new IllegalArgumentException(
                    "El comportamiento de graznido no puede ser nulo.");
        }
        this.graznido = graznido;
    }
}