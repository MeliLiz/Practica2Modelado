/**
 * Clase que simula una hamburguesa vegetariana
 * @see Hamburguesa
 */
public class HamburguesaClasicaVegetariana extends Hamburguesa{

    /**
     * Constructor
     */
    public HamburguesaClasicaVegetariana(){
        super(2253,"Hamburguesa Clasica Vegetariana", "Hamburguesa con carne de soya, queso panela, lechuga y jitomate",130, true, true);
    }

    @Override
    public void ponerQueso() {
        System.out.println("Poniendo queso panela");
        
    }

    @Override
    public void prepararCarne() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void ponerVegetales() {
        System.out.println("Poniendo lechuga y jitomate");
    }
}
