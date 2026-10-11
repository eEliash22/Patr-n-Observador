public class NoVolar implements ComportamientoVuelo {

    @Override
    public void volar() {
        System.out.println("Este pato no puede volar.");
    }
}