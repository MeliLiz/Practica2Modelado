public class HamburguesaClasica extends Hamburguesa{

    public HamburguesaClasica(){
        super(1144,"HamburguesaClasica","Hamburquesa con carne de res, queso manchego, lechuga y jitomate",100,true,false);
    }

    @Override
    public void prepararCarne() {
        System.out.println("Preparando carne de res");
        
    }

    @Override
    public void ponerQueso() {
        System.out.println("Poniendo queso manchego");
        
    }

    @Override
    public void ponerVegetales() {
        System.out.println("Poniendo lechuga y jitomate");
        
    }
}
