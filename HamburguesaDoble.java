public class HamburguesaDoble extends Hamburguesa {
    public HamburguesaDoble(){
        super(1234,"Hamburguesa doble", "Hamburguesa con doble carne de res, queso amarillo, lechuga, jitomate y cebolla",160,true,false);
    }

    @Override
    public void ponerQueso(){
        System.out.println("Poniendo queso amarillo");
    }

    @Override
    public void ponerVegetales() {
        System.out.println("Poniendo lechuga, jitomate y cebolla");
        
    }

    @Override
    public void prepararCarne() {
        System.out.println("Preparando las dos piezas de carne");
        
    }
}
