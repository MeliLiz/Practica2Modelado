/**
 * Clase que simula una hamburguesa deLuxe
 * 
 * @see Hamburguesa
 */
public class HamburguesaDeLuxe extends Hamburguesa {

    /**
     * Constructor
     */
    public HamburguesaDeLuxe() {
        super(1997, "Hamburguesa DeLuxe",
                "Hamburguesa de carne rib-eye con tocino queso fondue, lechuga, jitomate, aguacate y cebolla", 310,
                true, false);
    }

    /**
     * Metodo para preparar la carne de la hamburguesa
     */
    @Override
    public void prepararCarne() {
        System.out.println("Preparando la carne rib-eye");
        System.out.println("Friendo tocino");
    }

    /**
     * Metodo para poner queso a la hamburguesa
     */
    @Override
    public void ponerQueso() {
        System.out.println("Poniendo el queso fondue");

    }

    /**
     * Metodo para poner vegetales en la hamburguesa
     */
    @Override
    public void ponerVegetales() {
        System.out.println("Poniendo lechuga, jitomate, cebolla y aguacate");

    }

}
