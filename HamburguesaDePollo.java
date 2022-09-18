/**
 * Clase que simula una hamburguesa de pollo
 * @see Hamburguesa
 */
public class HamburguesaDePollo extends Hamburguesa{

    /**
     * Constructor
     */
    public HamburguesaDePollo(){
        super(4204,"Hamburguesa de pollo", "Hamburguesa de carne de pechuga de pollo con lechuga y jitomate",120,false,false);
    }

    @Override
    public void ponerQueso() {

    }

    @Override
    public void ponerVegetales() {
        System.out.println("Poniendo lechuga y jitomate");
        
    }

    @Override
    public void prepararCarne() {
        System.out.println("Preparando la pechuga de pollo");
        
    }
}
