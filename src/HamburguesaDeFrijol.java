/**
 * Clase que simula una hamburguesa de frijol
 * 
 * @see Hamburguesa
 */
public class HamburguesaDeFrijol extends Hamburguesa {

    /**
     * Constructor
     * Esta hamburguesa es vegetariana
     */
    public HamburguesaDeFrijol() {
        super(1010, "Hamburguesa de frijol", "Hamburguesa con carne de frijol, con queso crema, lechuga y jitomate",
                140, true, true);
    }

    /**
     * Metodo para preparar la carne de la hamburguesa
     */
    @Override
    public void prepararCarne() {
        System.out.println("Preparando la carne de pasta de frijol");

    }

    /**
     * Metodo para poner queso a la hamburguesa
     */
    @Override
    public void ponerQueso() {
        System.out.println("Poniendo queso crema");

    }

    /**
     * Metodo para poner vegetales en la hamburguesa
     */
    @Override
    public void ponerVegetales() {
        System.out.println("Poniendo lechuga y jitomate");

    }

}
