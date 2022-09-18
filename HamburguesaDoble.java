/**
 * Clase que simula una hamburguesa doble
 * 
 * @see Hamburguesa
 */
public class HamburguesaDoble extends Hamburguesa {

    /**
     * Constructor
     */
    public HamburguesaDoble() {
        super(1234, "Hamburguesa doble",
                "Hamburguesa con doble carne de res, queso amarillo, lechuga, jitomate y cebolla", 160, true, false);
    }

    /**
     * Metodo para preparar la carne de la hamburguesa
     */
    @Override
    public void prepararCarne() {
        System.out.println("Preparando las dos piezas de carne");

    }

    /**
     * Metodo para poner queso a la hamburguesa
     * 
     */
    @Override
    public void ponerQueso() {
        System.out.println("Poniendo queso amarillo");
    }

    /**
     * Metodo para poner vegetales en la hamburguesa
     */
    @Override
    public void ponerVegetales() {
        System.out.println("Poniendo lechuga, jitomate y cebolla");

    }

}
