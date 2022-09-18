/**
 * Clase que simula una hamburguesa vegetariana
 * 
 * @see Hamburguesa
 */
public class HamburguesaClasicaVegetariana extends Hamburguesa {

    /**
     * Constructor
     * Esta hamburguesa es vegetariana
     */
    public HamburguesaClasicaVegetariana() {
        super(2253, "Hamburguesa Clasica Vegetariana",
                "Hamburguesa con sustituto de carne de soya, queso panela, lechuga y jitomate", 130, true, true);
    }

    /**
     * Metodo para preparar la carne de la hamburguesa
     */
    @Override
    public void prepararCarne() {
        System.out.println("Preparando el sustituto de carne de soya");

    }

    /**
     * Metodo para poner queso a la hamburguesa
     */
    @Override
    public void ponerQueso() {
        System.out.println("Poniendo queso panela");

    }

    /**
     * Metodo para poner vegetales en la hamburguesa
     */
    @Override
    public void ponerVegetales() {
        System.out.println("Poniendo lechuga y jitomate");
    }
}
