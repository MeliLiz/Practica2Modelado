public class HamburguesaDeLuxe extends Hamburguesa{
    public HamburguesaDeLuxe(){
        super(1997,"Hamburguesa DeLuxe","Hamburguesa de carne rib-eye con tocino queso fondue, lechuga, jitomate, aguacate y cebolla",310,true,false);
    }

    @Override
    public void ponerQueso() {
        System.out.println("Poniendo el queso fondue");
        
    }

    @Override
    public void ponerVegetales() {
        System.out.println("Poniendo lechuga, jitomate, cebolla y aguacate");
        
    }

    @Override
    public void prepararCarne() {
        System.out.println("Preparando la carne rib-eye"); 
        System.out.println("Friendo tocino");
    }


}
