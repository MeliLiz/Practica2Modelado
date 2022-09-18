/**
 * Clase que simula una hamburguesa ClubHouse
 * @see Hamburguesa
 */
public class HamburguesaClubHouse extends Hamburguesa{

    /**
     * Constructor
     */
    public HamburguesaClubHouse(){
        super(4020,"Hamburguesa ClubHouse", "Hamburguesa con carne de pastor vegetariano con lechuga y piña",250,false,true);
    }

    @Override
    public void prepararCarne() {
        System.out.println("Preparando la carne vegetariana de pastor");
        
    }

    @Override
    public void ponerQueso() {
        return;
        
    }

    @Override
    public void ponerVegetales() {
        System.out.println("Poniendo lechuga y piña");
        
    }
}
