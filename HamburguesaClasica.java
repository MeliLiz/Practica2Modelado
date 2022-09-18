/**
 * Clase que sumula una hamburguesa clasica
 * 
 * @see Hamburguesa
 */
public class HamburguesaClasica extends Hamburguesa {

    /**
     * Constructor
     */
    public HamburguesaClasica() {
        super(1144, "HamburguesaClasica", "Hamburquesa con carne de res, queso manchego, lechuga y jitomate", 100, true,
                false);
    }

    /**
     * Metodo para preparar la carne de la hamburguesa
     */
    @Override
    public void prepararCarne() {
        System.out.println("Preparando carne de res");

    }

    /**
     * Metodo para poner queso a la hamburguesa
     */
    @Override
    public void ponerQueso() {
        System.out.println("Poniendo queso manchego");

    }

    /**
     * Metodo para poner vegetales en la hamburguesa
     */
    @Override
    public void ponerVegetales() {
        System.out.println("Poniendo lechuga y jitomate");

    }
}
