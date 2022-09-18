/**
 * Clase que simula una hamburguesa BigMeat
 * 
 * @see Hamburguesa
 */
public class HamburguesaBigMeat extends Hamburguesa {

    /**
     * Constructor
     */
    public HamburguesaBigMeat() {
        super(2074, "Hamburguesa BigMeat",
                "Hamburguesa con carne de arrachera, queso mozarella, aguacate, lechuga y cebolla", 300, true, false);
    }

    /**
     * Metodo para preparar la carne de la hamburguesa
     */
    @Override
    public void prepararCarne() {
        System.out.println("Preparando la carne de arrachera");

    }

    /**
     * Metodo para poner queso a la hamburguesa
     */
    @Override
    public void ponerQueso() {
        System.out.println("Poniendo queso mozarella");

    }

    /**
     * Metodo para poner vegetales en la hamburguesa
     */
    @Override
    public void ponerVegetales() {
        System.out.println("Poniendo aguacate, lechuga y cebolla");

    }
}
