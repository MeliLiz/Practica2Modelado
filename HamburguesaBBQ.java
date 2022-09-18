/**
 * Clase para simular una hamburguesa bbq
 * 
 * @see Hamburguesa
 */
public class HamburguesaBBQ extends Hamburguesa {

    /**
     * Constructor
     */
    public HamburguesaBBQ() {
        super(3182, "Hamburguesa BBQ", "Hamburguesa de carne de costilla a la BBQ con lechuga", 150, false, false);
    }

    /**
     * Metodo para preparar la carne de la hamburguesa
     */
    @Override
    public void prepararCarne() {
        System.out.println("Preparando la costilla a la BBQ");

    }

    /**
     * Metodo para poner queso a la hamburguesa
     */
    @Override
    public void ponerQueso() {
        return;
    }

    /**
     * Metodo para poner vegetales en la hamburguesa
     */
    @Override
    public void ponerVegetales() {
        System.out.println("Poniendo lechuga");

    }
}
