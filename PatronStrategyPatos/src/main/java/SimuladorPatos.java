public class SimuladorPatos {

    public static void main(String[] args) {

        PatoSilvestre silvestre = new PatoSilvestre(2);
        PatoDeGoma goma = new PatoDeGoma("Amarillo");

        Pato[] patos = {silvestre, goma};

        for (Pato pato : patos) {
            try {
                System.out.println("--------------------");
                pato.mostrar();
                pato.realizarVuelo();
                pato.realizarGraznido();

            } catch (ErrorPato e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        System.out.println("--------------------");
        System.out.println("Cambiando el comportamiento del pato de goma:");

        goma.establecerVuelo(new VueloConAlas());
        goma.establecerGraznido(new GraznarNormal());

        try {
            goma.realizarVuelo();
            goma.realizarGraznido();
        } catch (ErrorPato e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}