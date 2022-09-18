/**
 * Clase que simula una hamburguesa ClubHouse
 * 
 * @see Hamburguesa
 */
public class HamburguesaClubHouse extends Hamburguesa {

    /**
     * Constructor
     * Esta hamburguesa es vegetariana
     */
    public HamburguesaClubHouse() {
        super(4020, "Hamburguesa ClubHouse", "Hamburguesa con carne de pastor vegetariano con lechuga y piña", 250,
                false, true);
    }

    /**
     * Metodo para preparar la carne de la hamburguesa
     */
    @Override
    public void prepararCarne() {
        System.out.println("Preparando la carne vegetariana de pastor");

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
        System.out.println("Poniendo lechuga y piña");

    }
}
