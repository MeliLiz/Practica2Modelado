/**
 * Clase que simula una hamburguesa de pollo
 * 
 * @see Hamburguesa
 */
public class HamburguesaDePollo extends Hamburguesa {

    /**
     * Constructor
     */
    public HamburguesaDePollo() {
        super(4204, "Hamburguesa de pollo", "Hamburguesa de carne de pechuga de pollo con lechuga y jitomate", 120,
                false, false);
    }

    /**
     * Metodo para preparar la carne de la hamburguesa
     */
    @Override
    public void prepararCarne() {
        System.out.println("Preparando la pechuga de pollo");

    }

    /**
     * Metodo para poner queso a la hamburguesa
     * Esta hamburguesa no lleva queso
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
        System.out.println("Poniendo lechuga y jitomate");

    }

}
